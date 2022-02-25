package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Flow;
import com.bntu.timetable.entity.Group;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.FlowRepository;
import com.bntu.timetable.repository.GroupRepository;
import com.bntu.timetable.service.FlowService;
import com.bntu.timetable.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class FlowServiceImpl implements FlowService {

    @Autowired
    private FlowRepository flowRepository;

    @Autowired
    private GroupService groupService;

    @Override
    public Flow createFlow(Flow flow) {
        flow.setCreatedWhen(new Date());
        flow.setUpdatedWhen(new Date());
        flowRepository.save(flow);
        Flow finalFlow = flow;
        flow.getGroups().forEach(group -> {
            Group groupToFlow = groupService.getGroup(group.getId());
            groupToFlow.setFlow(finalFlow);
            groupService.updateGroup(groupToFlow);
        });
        return flow;
    }

    @Override
    public Flow updateFlow(Flow flow) {
        flow.setUpdatedWhen(new Date());
        List<Group> groupUnchanged = groupService.getGroupsByFlowId(flow.getId());
        flow.getGroups().forEach(group -> {
            Group groupToFlow = groupService.getGroup(group.getId());
            groupToFlow.setFlow(flow);
            groupService.updateGroup(groupToFlow);
        });


        groupUnchanged.forEach(uGroup -> {
            if (!isInGroupList(flow.getGroups(), uGroup.getId())){
                uGroup.setFlow(null);
                groupService.updateGroup(uGroup);
            }
        });

        return flowRepository.save(flow);
    }

    private boolean isInGroupList(List<Group> groups, UUID id) {
        for (Group g: groups) {
            if (g.getId().equals(id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Flow getFlow(UUID id) {
        return getFlowById(id);
    }

    private Flow getFlowById(UUID id) {
        Flow flow = flowRepository.findById(id).orElse(null);
        if (flow == null) {
            throw new RuntimeException(ErrorMessage.GROUP_NOT_FOUND);
        }
        return flow;
    }

    @Override
    public void deleteFlow(UUID id) {
        Flow flow = getFlowById(id);
        flow.getGroups().forEach(group -> {
            Group groupToFlow = groupService.getGroup(group.getId());
            groupToFlow.setFlow(null);
            groupService.updateGroup(groupToFlow);
        });
        flowRepository.deleteById(id);
    }

    @Override
    public List<Flow> getFlows() {
        return flowRepository.findAll();
    }

    @Override
    public List<Flow> getFlowsByDepartmentId(UUID departmentId) {
        return flowRepository.getFlowsByDepartmentId(departmentId);
    }

    @Override
    public List<Flow> getFlowsByDeaneryId(UUID deaneryId) {
        return flowRepository.getAllByDeanery_Id(deaneryId);
    }
}
