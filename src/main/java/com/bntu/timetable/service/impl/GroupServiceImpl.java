package com.bntu.timetable.service.impl;

import com.bntu.timetable.entity.Group;
import com.bntu.timetable.entity.Subgroup;
import com.bntu.timetable.errorhandling.ErrorMessage;
import com.bntu.timetable.repository.GroupRepository;
import com.bntu.timetable.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class GroupServiceImpl implements GroupService {

    @Autowired
    private GroupRepository groupRepository;

    @Override
    public Group createGroup(Group group) {
        group.getSubgroups().forEach(subgroup -> {
            subgroup.setGroup(group);
        });
        return groupRepository.save(group);
    }

    @Override
    public Group updateGroup(Group groupDto) {
        groupDto.getSubgroups().forEach(subgroup -> {
            subgroup.setGroup(groupDto);;
        });
        return groupRepository.save(groupDto);
    }

    private Group getGroupById(UUID id) {
        Group group = groupRepository.findById(id).orElse(null);
        if (group == null) {
            throw new RuntimeException(ErrorMessage.GROUP_NOT_FOUND);
        }
        return group;
    }

    @Override
    public Group getGroup(UUID id) {
        return getGroupById(id);
    }

    @Override
    public List<Group> getGroupsByDeaneryId(UUID deaneryId) {
        return groupRepository.findAllBySpeciality_Department_Deanery_Id(deaneryId);
    }

    @Override
    public List<Group> getGroupsByDepartmentId(UUID departmentId) {
        return groupRepository.findAllBySpeciality_Department_Id(departmentId);
    }

    @Override
    public List<Group> getGroupsByFlowId(UUID flowId) {
        return groupRepository.findAllByFlow_Id(flowId);
    }

    @Override
    public void deleteGroup(UUID id) {
        groupRepository.deleteById(id);
    }

    @Override
    public List<Group> getGroups() {
        return groupRepository.findAll();
    }
}
