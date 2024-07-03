truncate table organizer cascade;
truncate table event cascade;


insert into organizer(id,first_name,last_name,email,password)values
(10,'name','name1','name@gmail.com','1234'),
(11,'name2','name3','name1@gmail.com','1234'),
(12,'name4','name5','name2@gmail.com','1234'),
(13,'name6','name7','name3@gmail.com','1234'),
(14,'name8','name9','name4@gmail.com','1234');


insert into event( id,event_name,location,ticket_category,start_date,end_date)values
(100,'birthdayParty', 'Lagos', 'REGULAR','2024-07-03T13:16:04.045995300','2024-07-04T13:22:00.465340900'),
(101,'party', 'Abuja','VIP','2024-07-03T13:16:04.045995300','2024-07-04T13:22:00.465340900'),
(102,'weddingParty', 'Bauchi', 'PREMIUM','2024-07-03T13:16:04.045995300','2024-07-04T13:22:00.465340900'),
(103,'weddingParty', 'Jos', 'REGULAR','2024-07-03T13:16:04.045995300','2024-07-04T13:22:00.465340900');

--
-- insert into eventUser(name,email,ticket)values
-- ('chi','email@gmail.com','REGULAR'),
-- ('chiy','email1@gmail.com','VIP'),
-- ('chiu','email2@gmail.com','PREMIUM'),
-- ('chip','email3@gmail.com','REGULAR');
