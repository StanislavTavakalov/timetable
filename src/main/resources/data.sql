insert into permisson (id, name)
values ('c86a4f8d-9f9a-4569-9945-85168652552b', 'users:read'),
       ('c86a4f8d-9f9a-4569-9945-85168652555b', 'users:delete'),
       ('c86a4f8d-9f9a-4569-9945-85168652551b', 'users:update'),
       ('c86a4f8d-9f9a-4569-9945-85168652553b', 'users:block'),
       ('c83a4f8d-9f9a-4569-9945-85168652555b', 'roles:read'),
       ('feed8656-8798-4472-a55e-35059d44ab79', 'roles:create'),
       ('6f0f7970-025d-49ea-ac23-617051cf8b5f', 'roles:update'),
       ('c4b46f9d-1148-4c07-90c7-4f2aab5aee2a', 'roles:delete'),
       ('565c7c6c-4d04-4bf3-b9c0-70d0de3a81a7', 'wings:create'),
       ('01b69dce-6da8-4369-8135-0e3c9ce65931', 'wings:read'),
       ('6e8b8f03-27b0-465b-ab60-c83f9ab7c847', 'wings:delete'),
       ('efe7a483-e8dc-48ba-b149-2a4cefacf136', 'wings:update'),
       ('eb93a437-0273-4858-8fbf-1280ccad0610', 'deanery:create'),
       ('220091a6-2701-49a8-a0a3-cb503fe8174f', 'deanery:read'),
       ('fb574d01-5c74-40d0-ab7c-72cc7a530823', 'deanery:update'),
       ('bfc1e1af-4795-41e4-b8ec-823a34495426', 'deanery:delete'),
       ('ab4da700-d30a-4187-a979-936c09f4bacd', 'deanery:update'),
       ('6f6c1f55-8980-46eb-8d82-02d3ed35de87', 'department:create'),
       ('e7832793-8632-4f10-85f8-39137012e0a5', 'department:delete'),
       ('7e5caf55-bae8-4b56-b7e2-bc1e24d39f1e', 'department:read'),
       ('9ab531e6-bd70-4713-a229-210ea34e1921', 'department:update'),
       ('b01e494f-2931-481a-8472-30ec6dfcb987', 'buildings:create'),
       ('de0d9a9e-166f-4227-81af-757dcc741761', 'buildings:delete'),
       ('d2fefa3b-3c54-4f18-92ff-26796834aa3c', 'buildings:read'),
       ('9276f185-7d2f-48cb-8d4d-57f3457fcc78', 'buildings:update'),
       ('c48e6b4f-0238-4a83-8a70-e1dc8c25c311', 'floor:create'),
       ('162493eb-98c5-4e8b-9ae9-772bacfb0eeb', 'floor:delete'),
       ('cf42336a-fbcd-4aaa-82f7-b6b43b4bc141', 'floor:read'),
       ('66637b02-4138-4ba9-b2fd-df3404b9a69d', 'floor:update'),
       ('aadb350d-c72b-4b81-93eb-a787bcd7f31e', 'classroom:create'),
       ('50808631-99a0-4683-8185-e515527f0718', 'classroom:delete'),
       ('a192e83e-d027-4cb9-9f00-6176993165d7', 'classroom:read'),
       ('b466b63d-20f8-4c2c-b8c9-fdda9d1b4ea0', 'classroom:update'),
       ('c83a4f8d-9f8a-4569-9945-85168652557b', 'directions:read')
ON CONFLICT DO NOTHING;


insert into role (id, created_when, updated_when, name, role_category)
VALUES ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', now(), now(), 'Админ', 'ADMIN'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', now(), now(), 'Диспетчер ', 'DISPATCHER'),
       ('0468f355-99df-4b6e-bfa0-7c15f319baf1', now(), now(), 'Декан', 'DEANERY'),
       ('ad1858e1-610f-4a6a-97f8-2500c73c5d74', now(), now(), 'Заведующий кафедрой', 'DEPARTMENT')

ON CONFLICT DO NOTHING;


insert into role_permissions(role_id, permission_id)
VALUES ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652552b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652555b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652551b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652553b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c83a4f8d-9f9a-4569-9945-85168652555b'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'feed8656-8798-4472-a55e-35059d44ab79'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6f0f7970-025d-49ea-ac23-617051cf8b5f'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c4b46f9d-1148-4c07-90c7-4f2aab5aee2a'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '565c7c6c-4d04-4bf3-b9c0-70d0de3a81a7'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '01b69dce-6da8-4369-8135-0e3c9ce65931'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6e8b8f03-27b0-465b-ab60-c83f9ab7c847'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'efe7a483-e8dc-48ba-b149-2a4cefacf136'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'eb93a437-0273-4858-8fbf-1280ccad0610'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '220091a6-2701-49a8-a0a3-cb503fe8174f'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fb574d01-5c74-40d0-ab7c-72cc7a530823'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'bfc1e1af-4795-41e4-b8ec-823a34495426'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'ab4da700-d30a-4187-a979-936c09f4bacd'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6f6c1f55-8980-46eb-8d82-02d3ed35de87'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'e7832793-8632-4f10-85f8-39137012e0a5'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7e5caf55-bae8-4b56-b7e2-bc1e24d39f1e'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '9ab531e6-bd70-4713-a229-210ea34e1921'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'b01e494f-2931-481a-8472-30ec6dfcb987'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'de0d9a9e-166f-4227-81af-757dcc741761'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'd2fefa3b-3c54-4f18-92ff-26796834aa3c'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '9276f185-7d2f-48cb-8d4d-57f3457fcc78'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c48e6b4f-0238-4a83-8a70-e1dc8c25c311'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '162493eb-98c5-4e8b-9ae9-772bacfb0eeb'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'cf42336a-fbcd-4aaa-82f7-b6b43b4bc141'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '66637b02-4138-4ba9-b2fd-df3404b9a69d'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'aadb350d-c72b-4b81-93eb-a787bcd7f31e'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '50808631-99a0-4683-8185-e515527f0718'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'a192e83e-d027-4cb9-9f00-6176993165d7'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'b466b63d-20f8-4c2c-b8c9-fdda9d1b4ea0'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c83a4f8d-9f8a-4569-9945-85168652557b')
ON CONFLICT DO NOTHING;

INSERT INTO users (id, created_when, updated_when, email, first_name, last_name, password, patronymic, status,
                   role_id)
VALUES ('1485272a-809c-42c7-9e5c-61077e299811', now(), now(),
        'admin@gmail.com', 'admin', 'admin', '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'admin',
        'ACTIVE', 'ea7a09ea-ba86-4d24-82f2-1a18174541f3')
ON CONFLICT DO NOTHING;