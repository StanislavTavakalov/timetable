insert into permisson (id, name)
values ('c86a4f8d-9f9a-4569-9945-85168652552b', 'users:read'),
       ('c86a4f8d-9f9a-4569-9945-85168652555b', 'users:delete')
ON CONFLICT DO NOTHING;


insert into role (id, created_when, updated_when, name)
VALUES ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', null, null, 'ADMIN')
ON CONFLICT DO NOTHING;


insert into role_permissions(role_id, permission_id)
VALUES ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652552b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652555b')
ON CONFLICT DO NOTHING;

INSERT INTO users (id, created_when, updated_when, email, first_name, last_name, password, patronymic, status,
                          role_id)
VALUES ('1485272a-809c-42c7-9e5c-61077e299811', '2021-09-05 13:37:21.694000', '2021-09-05 13:37:21.694000',
        'admin@gmail.com', 'admin', 'admin', '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'admin',
        'ACTIVE', 'ea7a09ea-ba86-4d24-82f2-1a18174541f3')
ON CONFLICT DO NOTHING;
