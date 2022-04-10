-- Data.sql file is intended to upload initial data to DataBase during startup

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

       ('4c6131a6-59ec-4347-a687-61f752a55c82', 'speciality:read'),
       ('7525c1f2-f22c-4dde-9153-4ed8fc2ddffd', 'speciality:create'),
       ('4e7a4a0c-7e60-420d-a0d9-924ca6ebe8b7', 'speciality:update'),
       ('e177683e-f17e-4ba1-8121-3f57a5d2f630', 'speciality:delete'),

       ('185f0c7f-e70a-44f4-abcd-69d7f58b362c', 'group:read'),
       ('fa410844-37be-453b-aaa3-6e2126a0ce1f', 'group:create'),
       ('d0037f82-546e-4009-81ce-6b5e4cefef7d', 'group:update'),
       ('8cf90cc1-a4f0-4bb0-9944-a3c4f36af1ff', 'group:delete'),

       ('2ba1fc87-29fa-45d0-8d7e-01ba132d1d0f', 'degrees:create'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba133d1d0f', 'degrees:read'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba134d1d0f', 'degrees:update'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba135d1d0f', 'degrees:delete'),

       ('2ba1fc87-29fa-45d0-8d7e-01ba136d1d0f', 'titles:create'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba137d1d0f', 'titles:delete'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba138d1d0f', 'titles:update'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba139d1d0f', 'titles:read'),

       ('2ba1fc87-29fa-45d0-8d7e-01ba141d1d0f', 'positions:create'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba151d1d0f', 'positions:read'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba161d1d0f', 'positions:update'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba171d1d0f', 'positions:delete'),

       ('2ba1fc87-29fa-45d0-8d7e-01ba181d1d0f', 'worktariffs:create'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba191d1d0f', 'worktariffs:read'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba931d1d0f', 'worktariffs:update'),
       ('2ba1fc87-29fa-45d0-8d7e-01ba831d1d0f', 'worktariffs:delete'),

       ('430a927d-33a1-45a3-907b-3be47f118868', 'flow:create'),
       ('cf50e8d5-1fda-413d-b7bd-18b30ddb507c', 'flow:read'),
       ('2eb91765-8720-47e5-bd76-401f0ee02de8', 'flow:update'),
       ('ca66fccf-016d-4d65-a4d5-37ee826eb511', 'flow:delete'),

       ('f8f18983-982d-41c5-909b-8d255fe3fdbc', 'discipline:create'),
       ('a683c332-d33e-44df-89f5-a95f5a6b581c', 'discipline:read'),
       ('79ac7b41-6596-4a60-aa08-1123354133fa', 'discipline:update'),
       ('1f9dffe3-b494-449f-b7ee-1b4080757369', 'discipline:delete'),

       ('b0172320-c30c-4e3b-bfb9-ae43a0882bcc', 'disciplinegroups:create'),
       ('820c73ae-aebe-4b7c-8265-723e1f003402', 'disciplinegroups:read'),
       ('65e634e1-35d4-4d08-a569-544f2e1cbd3a', 'disciplinegroups:update'),
       ('19c7c379-8364-492a-8848-cbc228e7d34e', 'disciplinegroups:delete'),


       ('7b6ee6ba-9727-43c5-b8ab-bc8602f691c6', 'teacher:create'),
       ('75696c1e-d839-48f2-8085-c093a87c0123', 'teacher:read'),
       ('fc8c5c93-74fd-401a-8c9e-4de82abed812', 'teacher:update'),
       ('7b0852c7-9dd5-4d03-8ae1-32341fb0326d', 'teacher:delete'),

       ('7b6ee6ba-9727-43c5-b8ab-bc8402f691c6', 'universities:create'),
       ('75696c1e-d839-48f2-8085-c093a87c0543', 'universities:read'),
       ('fc8c5c93-74fd-401a-8c9e-4de82abed854', 'universities:update'),
       ('7b0852c7-9dd5-4d03-8ae1-39341fb0326d', 'universities:delete'),

       ('c1bf321a-ece6-4186-b41d-298b42d51e27', 'loads:create'),
       ('fdf3fa66-c8a3-4246-b333-c7d6da7882f9', 'loads:read'),
       ('8b381b4a-195f-42ca-bbe5-38f2ab564816', 'loads:update'),
       ('f0103073-853a-4820-8c61-503d51709ca6', 'loads:delete'),

       ('7f8dd327-f1e0-4d9b-9922-0e6f8b0b1cae', 'semester_loads:create'),
       ('2d0baba9-5a83-4af6-bafa-3a21f9ad1fb4', 'semester_loads:read'),
       ('aa8e4f94-570b-4034-a639-327866d9f5a7', 'semester_loads:update'),
       ('133eeb75-633e-48ff-9b61-22522bc630e5', 'semester_loads:delete'),

       ('dac83d09-d9c6-4fc1-9ed3-9e0dd594d089', 'activities:create'),
       ('9586bd2d-2480-4858-883d-f6958dcf81ac', 'activities:read'),
       ('2ef79236-2d12-4de3-a4a6-d41c894ed068', 'activities:update'),
       ('fb6adbe1-5385-4a0c-8cc1-318109e6a333', 'activities:delete')


ON CONFLICT DO NOTHING;


insert into role (id, created_when, updated_when, name, role_category)
VALUES ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', now(), now(), 'Админ', 'ADMIN'),
       ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', now(), now(), 'Диспетчер ', 'DISPATCHER'),
       ('0468f355-99df-4b6e-bfa0-7c15f319baf1', now(), now(), 'Декан', 'DEANERY'),
       ('ad1858e1-610f-4a6a-97f8-2500c73c5d74', now(), now(), 'Заведующий кафедрой',
        'DEPARTMENT')
ON CONFLICT DO NOTHING;


insert into role_permissions(role_id, permission_id)
VALUES
    -- Admin role

    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652552b'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652555b'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652551b'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c86a4f8d-9f9a-4569-9945-85168652553b'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c83a4f8d-9f9a-4569-9945-85168652555b'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'feed8656-8798-4472-a55e-35059d44ab79'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6f0f7970-025d-49ea-ac23-617051cf8b5f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c4b46f9d-1148-4c07-90c7-4f2aab5aee2a'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '565c7c6c-4d04-4bf3-b9c0-70d0de3a81a7'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '01b69dce-6da8-4369-8135-0e3c9ce65931'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6e8b8f03-27b0-465b-ab60-c83f9ab7c847'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'efe7a483-e8dc-48ba-b149-2a4cefacf136'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'eb93a437-0273-4858-8fbf-1280ccad0610'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '220091a6-2701-49a8-a0a3-cb503fe8174f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fb574d01-5c74-40d0-ab7c-72cc7a530823'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'bfc1e1af-4795-41e4-b8ec-823a34495426'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '6f6c1f55-8980-46eb-8d82-02d3ed35de87'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'e7832793-8632-4f10-85f8-39137012e0a5'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7e5caf55-bae8-4b56-b7e2-bc1e24d39f1e'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '9ab531e6-bd70-4713-a229-210ea34e1921'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'b01e494f-2931-481a-8472-30ec6dfcb987'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'de0d9a9e-166f-4227-81af-757dcc741761'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'd2fefa3b-3c54-4f18-92ff-26796834aa3c'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '9276f185-7d2f-48cb-8d4d-57f3457fcc78'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c48e6b4f-0238-4a83-8a70-e1dc8c25c311'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '162493eb-98c5-4e8b-9ae9-772bacfb0eeb'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'cf42336a-fbcd-4aaa-82f7-b6b43b4bc141'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '66637b02-4138-4ba9-b2fd-df3404b9a69d'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'aadb350d-c72b-4b81-93eb-a787bcd7f31e'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '50808631-99a0-4683-8185-e515527f0718'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'a192e83e-d027-4cb9-9f00-6176993165d7'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'b466b63d-20f8-4c2c-b8c9-fdda9d1b4ea0'),
    -- Specialities rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '4c6131a6-59ec-4347-a687-61f752a55c82'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7525c1f2-f22c-4dde-9153-4ed8fc2ddffd'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '4e7a4a0c-7e60-420d-a0d9-924ca6ebe8b7'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'e177683e-f17e-4ba1-8121-3f57a5d2f630'),
    -- Group rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '185f0c7f-e70a-44f4-abcd-69d7f58b362c'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fa410844-37be-453b-aaa3-6e2126a0ce1f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'd0037f82-546e-4009-81ce-6b5e4cefef7d'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '8cf90cc1-a4f0-4bb0-9944-a3c4f36af1ff'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba132d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba133d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba134d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba135d1d0f'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba136d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba137d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba138d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba139d1d0f'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba141d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba151d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba161d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba171d1d0f'),
    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba181d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba191d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba931d1d0f'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ba1fc87-29fa-45d0-8d7e-01ba831d1d0f'),
    -- Flow rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '430a927d-33a1-45a3-907b-3be47f118868'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'cf50e8d5-1fda-413d-b7bd-18b30ddb507c'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2eb91765-8720-47e5-bd76-401f0ee02de8'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'ca66fccf-016d-4d65-a4d5-37ee826eb511'),
    -- Teacher rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7b6ee6ba-9727-43c5-b8ab-bc8602f691c6'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '75696c1e-d839-48f2-8085-c093a87c0123'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fc8c5c93-74fd-401a-8c9e-4de82abed812'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7b0852c7-9dd5-4d03-8ae1-32341fb0326d'),
    -- Discipline rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'f8f18983-982d-41c5-909b-8d255fe3fdbc'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'a683c332-d33e-44df-89f5-a95f5a6b581c'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '79ac7b41-6596-4a60-aa08-1123354133fa'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '1f9dffe3-b494-449f-b7ee-1b4080757369'),
    -- Discipline Groups rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'b0172320-c30c-4e3b-bfb9-ae43a0882bcc'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '820c73ae-aebe-4b7c-8265-723e1f003402'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '65e634e1-35d4-4d08-a569-544f2e1cbd3a'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '19c7c379-8364-492a-8848-cbc228e7d34e'),
    --Universities rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7b6ee6ba-9727-43c5-b8ab-bc8402f691c6'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '75696c1e-d839-48f2-8085-c093a87c0543'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fc8c5c93-74fd-401a-8c9e-4de82abed854'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7b0852c7-9dd5-4d03-8ae1-39341fb0326d'),
    --Load rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'c1bf321a-ece6-4186-b41d-298b42d51e27'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fdf3fa66-c8a3-4246-b333-c7d6da7882f9'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '8b381b4a-195f-42ca-bbe5-38f2ab564816'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'f0103073-853a-4820-8c61-503d51709ca6'),
    --Semester Load rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '7f8dd327-f1e0-4d9b-9922-0e6f8b0b1cae'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2d0baba9-5a83-4af6-bafa-3a21f9ad1fb4'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'aa8e4f94-570b-4034-a639-327866d9f5a7'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '133eeb75-633e-48ff-9b61-22522bc630e5'),
    --Activities rights
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'dac83d09-d9c6-4fc1-9ed3-9e0dd594d089'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '9586bd2d-2480-4858-883d-f6958dcf81ac'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', '2ef79236-2d12-4de3-a4a6-d41c894ed068'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f3', 'fb6adbe1-5385-4a0c-8cc1-318109e6a333'),
    -- Admin role end

    -- Dispatcher role start

    -- TODO: add rights delimiter name
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', 'aadb350d-c72b-4b81-93eb-a787bcd7f31e'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', '50808631-99a0-4683-8185-e515527f0718'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', 'a192e83e-d027-4cb9-9f00-6176993165d7'),
    ('ea7a09ea-ba86-4d24-82f2-1a18174541f2', 'b466b63d-20f8-4c2c-b8c9-fdda9d1b4ea0'),

    -- Dispatcher role end

    -- Department role start

    -- TODO: add rights delimiter name
    ('ad1858e1-610f-4a6a-97f8-2500c73c5d74', '7e5caf55-bae8-4b56-b7e2-bc1e24d39f1e'),

    -- Department role end

    -- Deanery role start

    -- TODO: add rights delimiter name
    ('0468f355-99df-4b6e-bfa0-7c15f319baf1', '220091a6-2701-49a8-a0a3-cb503fe8174f')

    -- Deanery role end
ON CONFLICT DO NOTHING;

insert into deanery (id, created_when, updated_when, full_name, short_name, description)
VALUES ('e04dcd25-ed60-4fe2-91d6-9b3ee339a3e0', now(), now(),
        'Энергетический факультет', 'ЭФ',
        'Энергетический факультет – один из старейших ведущих факультетов университета, имеющий богатейший опыт в подготовке инженерных и научно-педагогических кадров в области электро- и теплоэнергетики.'),
       ('67f2bc24-2eba-4c48-b75e-07c82716192a', now(), now(),
        'Факультет технологий управления и гуманитаризации', 'ФТУГ',
        'Факультет технологий управления и гуманитаризации - уникальный факультет в Республике Беларусь, ведущий подготовку специалистов инженерного, экономического, управленческого и дизайнерского профиля. Наши выпускники получают двойную квалификацию и имеют широкое поле для профессиональной самореализации.'),
       ('9db1aeb3-550d-4d59-b652-0a11aa968fb5', now(), now(),
        'Факультет информационных технологий и робототехники', 'ФИТР',
        'Сегодня большая часть выпускников работает в области разработки современных компьютерных систем и информационных технологий. На кафедре имеются учебные классы и лаборатории, оснащенные современными компьютерами и техническими средствами.')
ON CONFLICT DO NOTHING;


INSERT INTO department (id, created_when, updated_when, code, full_name, short_name, deanery_id, description)
VALUES ('79f61b01-11c6-43f8-9f8c-2e60a5aacb26', now(), now(), 'ФИТР-47',
        'Программное обеспечение информационных систем и технологий', 'ПОИСиТ', '9db1aeb3-550d-4d59-b652-0a11aa968fb5',
        'Сегодня большая часть выпускников работает в области разработки современных компьютерных систем и информационных технологий.'),
       ('67f2bc24-2eba-4c48-b75e-07c82716191a', now(), now(), 'ФИТР-53',
        'Робототехнические системы', 'РТС', '9db1aeb3-550d-4d59-b652-0a11aa968fb5',
        'История кафедры начинается с 1980г., на базе кафедры "Металлорежущие станки и инструменты" на машиностроительном факультете была образована кафедра "Автоматизация и комплексная механизация машиностроения", для подготовки инженеров по специальности под этим же названием. '),
       ('c1dd6896-52fc-450a-acf3-bd3c1a376747', now(), now(), 'ЭФ-108', 'Тепловые электрические станции', 'ТЭС',
        'e04dcd25-ed60-4fe2-91d6-9b3ee339a3e0', 'Кафедра «Тепловые электрические станции»')
ON CONFLICT
    DO NOTHING;

INSERT INTO users
(id, created_when, updated_when, email, first_name, last_name, password, patronymic, status, deanery_id, role_id,
 department_id)
VALUES ('1485272a-809c-42c7-9e5c-61077e299811', now(), now(), 'admin@gmail.com', 'Станислав', 'Тавакалов',
        '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'Сергеевич', 'ACTIVE', null,
        'ea7a09ea-ba86-4d24-82f2-1a18174541f3', null),
       ('4e8db6fd-1fe6-4e62-99ca-32fdff36e78b', now(), now(), 'polit99254@cyadp.com', 'Иван', 'Иванов',
        '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'Иванович', 'ACTIVE', null,
        'ea7a09ea-ba86-4d24-82f2-1a18174541f2', null),
       ('d7a8cdd8-96c1-4fed-8f71-5889bdd97f7a', now(), now(), 'safita3425@ingfix.com', 'Юрий', 'Полозков',
        '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'Владимирович', 'ACTIVE', null,
        'ad1858e1-610f-4a6a-97f8-2500c73c5d74', '79f61b01-11c6-43f8-9f8c-2e60a5aacb26'),
       ('e28b5564-f5f5-4f37-b776-c6992e91d20e', now(), now(), 'rojej79013@datakop.com', 'Андрей', 'Авсиевич',
        '$2a$12$7UNAZOZvrLMugXU34YuMeOHNaWW5YvDvV2PxWUUpJQ4UKgD3F6JgS', 'Михайлович', 'ACTIVE',
        '9db1aeb3-550d-4d59-b652-0a11aa968fb5', '0468f355-99df-4b6e-bfa0-7c15f319baf1', null)
ON CONFLICT DO NOTHING;



INSERT INTO building
    (id, created_when, updated_when, description, number)
VALUES ('69813fda-f2a4-4672-845f-052d9f71d50f', '2021-12-06 00:16:43.074000', '2021-12-06 00:16:43.074000',
        'Белорусский национальный технический университет — высшее учебное заведение инженерно-технического профиля. Ведущее учебное заведение в национальной системе образования Белоруссии в этом профиле. Первоначально в институте было 6 специальных отделений: механическое, инженерно-строительное, культурно-техническое, техником-химическое, электротехническое, лесное. По другим данным, набор студентов осуществляли пять факультетов: механический, инженерно-строительный, культурно-технический, химико-технологический, электротехнический. Первым ректором был назначен Никанор Казимирович Ярошевич. Преподавательский состав насчитывал 56 человек. В первом учебном году в институте обучались 305 студентов и 119 слушателей подготовительного отделения (61 % белорусов, 38 % евреев; 92,9 % мужчин, 7,1 % женщин). В дальнейшем, после ряда реорганизаций 1 июля 1933 года СовНарком БССР принимает решение о восстановлении политехнического института, в котором в сентябре 1933 году работали уже 120 преподавателей и действовало 20 кафедр, а также обучалось около 1200 студентов.',
        '3'),
       ('e7cc36b0-1b59-4174-9e9f-2d543d5556d8', '2021-12-06 00:16:37.426000', '2021-12-06 00:16:37.426000',
        'Белорусский национальный технический университет — высшее учебное заведение инженерно-технического профиля. Ведущее учебное заведение в национальной системе образования Белоруссии в этом профиле. Первоначально в институте было 6 специальных отделений: механическое, инженерно-строительное, культурно-техническое, техником-химическое, электротехническое, лесное. По другим данным, набор студентов осуществляли пять факультетов: механический, инженерно-строительный, культурно-технический, химико-технологический, электротехнический. Первым ректором был назначен Никанор Казимирович Ярошевич. Преподавательский состав насчитывал 56 человек. В первом учебном году в институте обучались 305 студентов и 119 слушателей подготовительного отделения (61 % белорусов, 38 % евреев; 92,9 % мужчин, 7,1 % женщин). В дальнейшем, после ряда реорганизаций 1 июля 1933 года СовНарком БССР принимает решение о восстановлении политехнического института, в котором в сентябре 1933 году работали уже 120 преподавателей и действовало 20 кафедр, а также обучалось около 1200 студентов.',
        '5'),
       ('b1c1d7e3-8258-48d0-a7e4-22d365500ef5', '2021-12-06 00:16:50.753000', '2021-12-06 00:17:20.421000',
        'Белорусский национальный технический университет — высшее учебное заведение инженерно-технического профиля. Ведущее учебное заведение в национальной системе образования Белоруссии в этом профиле. Первоначально в институте было 6 специальных отделений: механическое, инженерно-строительное, культурно-техническое, техником-химическое, электротехническое, лесное. По другим данным, набор студентов осуществляли пять факультетов: механический, инженерно-строительный, культурно-технический, химико-технологический, электротехнический. Первым ректором был назначен Никанор Казимирович Ярошевич. Преподавательский состав насчитывал 56 человек. В первом учебном году в институте обучались 305 студентов и 119 слушателей подготовительного отделения (61 % белорусов, 38 % евреев; 92,9 % мужчин, 7,1 % женщин). В дальнейшем, после ряда реорганизаций 1 июля 1933 года СовНарком БССР принимает решение о восстановлении политехнического института, в котором в сентябре 1933 году работали уже 120 преподавателей и действовало 20 кафедр, а также обучалось около 1200 студентов.',
        '1'),
       ('86a6d897-f2ad-43b3-a388-d1880881d14e', '2021-12-06 00:17:45.155000', '2021-12-06 00:17:45.155000',
        'Белорусский национальный технический университет — высшее учебное заведение инженерно-технического профиля. Ведущее учебное заведение в национальной системе образования Белоруссии в этом профиле. Первоначально в институте было 6 специальных отделений: механическое, инженерно-строительное, культурно-техническое, техником-химическое, электротехническое, лесное. По другим данным, набор студентов осуществляли пять факультетов: механический, инженерно-строительный, культурно-технический, химико-технологический, электротехнический. Первым ректором был назначен Никанор Казимирович Ярошевич. Преподавательский состав насчитывал 56 человек. В первом учебном году в институте обучались 305 студентов и 119 слушателей подготовительного отделения (61 % белорусов, 38 % евреев; 92,9 % мужчин, 7,1 % женщин). В дальнейшем, после ряда реорганизаций 1 июля 1933 года СовНарком БССР принимает решение о восстановлении политехнического института, в котором в сентябре 1933 году работали уже 120 преподавателей и действовало 20 кафедр, а также обучалось около 1200 студентов.',
        '8')
ON CONFLICT DO NOTHING;

INSERT INTO floor (id, created_when, updated_when, number, building_id)
VALUES ('66202ecd-5bdf-4ea0-8bc5-9ec898147454', '2021-12-06 00:16:37.427000', '2021-12-06 00:16:37.427000', 1,
        'e7cc36b0-1b59-4174-9e9f-2d543d5556d8'),
       ('8ab7c590-74a4-4ff1-a216-3f2ca71cc34f', '2021-12-06 00:16:37.428000', '2021-12-06 00:16:37.428000', 2,
        'e7cc36b0-1b59-4174-9e9f-2d543d5556d8'),
       ('5c2359c8-ed39-4b26-b6e1-ad1047ab263c', '2021-12-06 00:16:37.428000', '2021-12-06 00:16:37.428000', 3,
        'e7cc36b0-1b59-4174-9e9f-2d543d5556d8'),
       ('f9632b11-f001-4520-b803-d80837f19556', '2021-12-06 00:16:37.429000', '2021-12-06 00:16:37.429000', 4,
        'e7cc36b0-1b59-4174-9e9f-2d543d5556d8'),
       ('6dbaabff-a635-4895-9152-64c99bf07883', '2021-12-06 00:16:43.075000', '2021-12-06 00:16:43.075000', 1,
        '69813fda-f2a4-4672-845f-052d9f71d50f'),
       ('71ab0c1e-d124-4125-a28d-f94b6fbfa60d', '2021-12-06 00:16:43.076000', '2021-12-06 00:16:43.076000', 2,
        '69813fda-f2a4-4672-845f-052d9f71d50f'),
       ('1d245649-4070-47d9-9ada-b94d7ae163ff', '2021-12-06 00:16:43.077000', '2021-12-06 00:16:43.077000', 3,
        '69813fda-f2a4-4672-845f-052d9f71d50f'),
       ('d1c292b5-e0dc-4a46-a2b4-a238461822c7', '2021-12-06 00:16:50.754000', '2021-12-06 00:17:20.422000', 1,
        'b1c1d7e3-8258-48d0-a7e4-22d365500ef5'),
       ('f535c718-e1fb-4b6a-bcca-907157fbd6ae', '2021-12-06 00:16:50.755000', '2021-12-06 00:17:20.425000', 2,
        'b1c1d7e3-8258-48d0-a7e4-22d365500ef5'),
       ('7d5bce5a-4072-442c-9a04-8fb35e646540', '2021-12-06 00:16:50.756000', '2021-12-06 00:17:20.426000', 3,
        'b1c1d7e3-8258-48d0-a7e4-22d365500ef5'),
       ('88b00a76-4cdb-44eb-b264-8512018fa088', '2021-12-06 00:16:50.756000', '2021-12-06 00:17:20.427000', 4,
        'b1c1d7e3-8258-48d0-a7e4-22d365500ef5'),
       ('280d8fb2-5072-45d4-819d-d8729edcbc93', '2021-12-06 00:17:45.157000', '2021-12-06 00:17:45.157000', 1,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('b950b29c-f639-4b3a-84d0-18559285c4cf', '2021-12-06 00:17:45.157000', '2021-12-06 00:17:45.157000', 2,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('ea54a3a8-46a0-4e41-8b75-c79cbcc897c9', '2021-12-06 00:17:45.158000', '2021-12-06 00:17:45.158000', 3,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('4732c65e-cd4f-401d-9bcf-dfbc8f70533b', '2021-12-06 00:17:45.158000', '2021-12-06 00:17:45.158000', 4,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('38007578-5565-43e8-8e83-e8479bb9b94d', '2021-12-06 00:17:45.159000', '2021-12-06 00:17:45.159000', 5,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('2c233534-c10b-4b42-8949-35cf4d36dcad', '2021-12-06 00:17:45.159000', '2021-12-06 00:17:45.159000', 6,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('dbeefe0e-3684-4180-95a7-58f5593a0b10', '2021-12-06 00:17:45.160000', '2021-12-06 00:17:45.160000', 7,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('95f9f317-96e5-4fc8-ab6d-5b6c15c1fe30', '2021-12-06 00:17:45.160000', '2021-12-06 00:17:45.160000', 8,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('895b5c97-dd5f-42c4-b700-74863302a28f', '2021-12-06 00:17:45.160000', '2021-12-06 00:17:45.160000', 9,
        '86a6d897-f2ad-43b3-a388-d1880881d14e'),
       ('f343d1e6-5a94-47cb-b5c6-0da556b7f5fd', '2021-12-06 00:17:45.161000', '2021-12-06 00:17:45.161000', 10,
        '86a6d897-f2ad-43b3-a388-d1880881d14e')
ON CONFLICT DO NOTHING;

INSERT INTO public.classroom_type
    (id, created_when, updated_when, color, name)
VALUES ('6ab3c6f6-4331-45e0-986d-0ddf3479851a', '2021-12-21 01:40:35.000000', '2021-12-21 01:40:36.000000', 'green',
        'Лекционная'),
       ('5ab3c6f6-4331-45e0-986d-0ddf3479851a', '2021-12-21 01:40:37.000000', '2021-12-21 01:40:37.000000', 'blue',
        'Лабораторная'),
       ('4ab3c6f6-4331-45e0-986d-0ddf3479851a', '2021-12-21 01:40:38.000000', '2021-12-21 01:40:38.000000', 'red',
        'Практическая')
ON CONFLICT DO NOTHING;

INSERT INTO public.classroom_specialization
    (id, created_when, updated_when, name)
VALUES ('c785573d-016b-4b53-af2f-84d04e0cd996', '2021-12-21 01:43:09.000000', '2021-12-21 01:43:08.000000',
        'Спортивная'),
       ('c685573d-016b-4b53-af2f-84d04e0cd996', '2021-12-21 01:43:08.000000', '2021-12-21 01:43:09.000000',
        'Компьютерная'),
       ('c585573d-016b-4b53-af2f-84d04e0cd996', '2021-12-21 01:43:10.000000', '2021-12-21 01:43:10.000000',
        'Химическая'),
       ('c485573d-016b-4b53-af2f-84d04e0cd996', '2021-12-21 01:43:11.000000', '2021-12-21 01:43:11.000000',
        'Физическая')
ON CONFLICT DO NOTHING;

INSERT INTO public.academic_degree
    (id, created_when, updated_when, name)
VALUES ('c785573d-016b-4b53-af2f-67d04e0cd996', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:08.000000',
        'Доцент'),
       ('c685573d-016b-4b53-af2f-88d04e0cd996', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:09.000000',
        'Профессор')
ON CONFLICT DO NOTHING;

INSERT INTO public.academic_title
    (id, created_when, updated_when, name)
VALUES ('c785573d-016b-4b53-af2f-67d04e0cd992', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:08.000000',
        'Кандидат наук'),
       ('c685573d-016b-4b53-af2f-88d04e0cd993', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:09.000000',
        'Доктор наук')
ON CONFLICT DO NOTHING;

INSERT INTO public.teacher_position
    (id, created_when, updated_when, name)
VALUES ('c785573d-016b-4b53-af2f-67d04e0cd998', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:08.000000',
        'Преподаватель'),
       ('c685573d-016b-4b53-af2f-88d04e0cd993', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:09.000000',
        'Старший преподаватель')
ON CONFLICT DO NOTHING;


INSERT INTO public.work_tariff
    (id, created_when, updated_when, name)
VALUES ('c785573d-016b-4b53-af2f-67d04e0cd596', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:08.000000',
        '0.5'),
       ('c685573d-016b-4b53-af2f-88d04e0cd496', '2022-02-05 01:43:09.000000', '2022-02-05 01:43:09.000000',
        '1')
ON CONFLICT DO NOTHING;


INSERT INTO speciality (id, created_when, updated_when, description, direction_code, direction_name, full_name,
                        short_code, short_name, speciality_code, specialization_code, specialization_name,
                        department_id)
VALUES ('2135088e-20b1-42c5-9b26-4dad97fb3c0c', now(), now(), 'Специальность ориентирована на подготовку программистов - разработчиков прикладного программного обеспечения.
Выпускники владеют современными средствами создания программных продуктов, реализующих компьютерное моделирование систем и процессов, представление, хранение, защиту и обработку информации с помощью различных инструментальных сред.
Выпускники кафедры – IT-специалисты: будущие руководители проектов, программисты, тестировщики, системные администраторы различных государственных и коммерческих структур.
Выпускающая кафедра «Программное обеспечение информационных систем и технологий».
Выпускники получают квалификацию «инженер-программист».', '', '', 'Программное обеспечение информационных технологий',
        '01', 'ПОИТ', ' 1-40 01 01', null, '', '79f61b01-11c6-43f8-9f8c-2e60a5aacb26'),
       ('ac7a9936-0edd-4bce-a28c-84663d5572db', now(), now(), 'Направление специальности ориентировано на подготовку программистов, владеющих современными информационными технологиями обработки и представления информации в технике, производстве, социальной сфере. Обучение студентов ведется с учетом новых тенденций развития интегрированных сред, распределенной обработки данных, разработки приложений для мобильных устройств, хранения и доступа к данным на основе востребованных систем управления базами данных. Особое внимание уделяется изучению технологий разработки Internet и Web-приложений, проектированию информационного обеспечения, организации информационно-вычислительных процессов и систем, систем сбора, хранения и обработки текстовой и графической информации.
Выпускающая кафедра «Программное обеспечение информационных систем и технологий».
Выпускники получают квалификацию «инженер-программист».', '04',
        'Информационные системы и технологии (в обработке и представлении информации)',
        'Информационные системы и технологии', '02', 'ИСИТ', '1-40 05 01', '01',
        'Математическое обеспечение и системное программирование', '79f61b01-11c6-43f8-9f8c-2e60a5aacb26'),
       ('de382d9e-3e6f-4f5c-9e4b-ac7bea6687e8', now(), now(), 'Подготовку специалистов по специальности 1-53 01 04 осуществляет кафедра «Тепловые электрические станции» с присвоением выпускникам квалификации «инженер-теплоэнергетик по автоматизации».
Студенты глубоко изучают теплоэнергетические дисциплины, связанные с работой основного и вспомогательного оборудования тепловых электрических станций как объектов управления, теорию автоматического управления, методы и средства измерения, а также технические средства автоматизации, включая информационные и управляющие комплексы.
Выпускники кафедры могут работать не только в качестве инженеров по автоматизации, специалистов по контрольно-измерительным приборам и автоматизированным системам управления технологическими процессами на ТЭС, но и успешно выполнять инженерные функции в других энергетических предприятиях.
Среди предприятий и организаций, на которые распределяются выпускники кафедры «Тепловые электрические станции», − Государственное производственное объединение «Белэнерго» (тепловые электростанции, предприятия тепловых сетей), ОАО «Белэнергоремналадка», ОАО «Центрэнергомонтаж», Белорусский теплоэнергетический институт («БелТЭИ»), Белорусский научно-исследовательский и проектный институт энергетической промышленности («БелНИПИэнергопром»), предприятия жилищно-коммунального сектора и промышленности и др.',
        null, null, 'Автоматизация и управление теплоэнергетическими процессами', '01', 'АиУПТ', '1-53 01 04', null,
        null, 'c1dd6896-52fc-450a-acf3-bd3c1a376747')
ON CONFLICT DO NOTHING;

INSERT INTO study_group (id, created_when, updated_when, enter_year, number, student_count, speciality_id)
VALUES ('399cf85e-62da-4ee3-aed1-fd4a12aec076', now(), now(), 2022,
        '10801122', 20, 'de382d9e-3e6f-4f5c-9e4b-ac7bea6687e8'),
       ('4cdcf958-8027-4c00-91ba-691b97d82118', now(), now(), 2022,
        '10801222', 23, 'de382d9e-3e6f-4f5c-9e4b-ac7bea6687e8'),
       ('a499da89-1c61-473a-bb5a-5066324f43fa', now(), now(), 2022, '10701122', 22,
        '2135088e-20b1-42c5-9b26-4dad97fb3c0c'),
       ('11b66d59-19ea-4878-a6e2-0c29975462da', now(), now(), 2022,
        '10701222', 35, '2135088e-20b1-42c5-9b26-4dad97fb3c0c'),
       ('d492e863-8654-420c-ae94-02f45bf09fa3', now(), now(), 2022,
        '10702122', 21, 'ac7a9936-0edd-4bce-a28c-84663d5572db')
ON CONFLICT DO NOTHING;


INSERT INTO subgroup (id, created_when, updated_when, number, student_count, group_id)
VALUES ('e2e72e85-f400-4479-a8b6-311e9c690236', '2022-03-01 10:45:52.172208', '2022-03-01 10:45:52.172208', 1, 10,
        '399cf85e-62da-4ee3-aed1-fd4a12aec076'),
       ('ffe8e99e-1994-4ae4-897e-9ff2f1a0e7ce', now(), now(), 2, 10, '399cf85e-62da-4ee3-aed1-fd4a12aec076'),
       ('63f0028f-a2ab-4fc2-bdec-c802b7f9f1ef', now(), now(), 2, 10, '4cdcf958-8027-4c00-91ba-691b97d82118'),
       ('fb085391-6c07-4b80-b512-dc073e6b17c7', now(), now(), 1, 13, '4cdcf958-8027-4c00-91ba-691b97d82118'),
       ('5fa18d77-e67c-4849-aa17-aa634b4ab563', now(), now(), 2, 10, 'd492e863-8654-420c-ae94-02f45bf09fa3'),
       ('f7f92b1e-6770-4d78-80f5-ea73354c89ec', now(), now(), 1, 11, 'd492e863-8654-420c-ae94-02f45bf09fa3'),
       ('dc90954d-8d3a-47fa-9a38-3a4bdda5509b', now(), now(), 3, 11, '11b66d59-19ea-4878-a6e2-0c29975462da'),
       ('fcef2a24-b0f6-4e2e-9ad7-2daf3d44e171', now(), now(), 1, 12, '11b66d59-19ea-4878-a6e2-0c29975462da'),
       ('bf3f8556-199f-4b12-82a3-ceed8d194206', now(), now(), 2, 12, '11b66d59-19ea-4878-a6e2-0c29975462da'),
       ('e4f5fac3-3420-49b2-9512-d88919d739ed', now(), now(), 1, 11, 'a499da89-1c61-473a-bb5a-5066324f43fa'),
       ('9e832880-462c-40c6-ac47-569c5318d47d', now(), now(), 2, 11, 'a499da89-1c61-473a-bb5a-5066324f43fa')
ON CONFLICT DO NOTHING;


INSERT INTO public.discipline_group (id, created_when, updated_when, name)
VALUES ('26da3d4b-f9f8-483f-ad66-294509f041ad', now(), now(),
        'Математика'),
       ('4a6a0b5d-7995-4f2d-8f87-3a8c548caaab', now(), now(),
        'Языки программирования'),
       ('d812a820-8407-4fb8-a97a-0a72f67130a3', now(), now(),
        'Компьютерная графика')
ON CONFLICT DO NOTHING;

INSERT INTO public.activity (id, created_when, updated_when, name, symbol)
VALUES ('26da3d4b-f9f8-483f-ad66-294509f042ad', now(), now(),
        'Теоритическое обучение', ' '),
       ('4a6a0b5d-7995-4f2d-8f87-3a8c528caaab', now(), now(),
        'Экзаменнационная сессия', ':'),
       ('d812a820-8407-4fb8-a97a-0a72f69330a3', now(), now(),
        'Практика', '-')
ON CONFLICT DO NOTHING;