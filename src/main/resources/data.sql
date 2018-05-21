insert into car ( id, make, model, vin, year) values (1, 'Honda', 'Civic', 'VIN7847384739', '2017');
insert into car ( id, make, model, vin, year) values (2, 'Toyota', 'Camry', 'VIN7847384383', '2018');

insert into conversation (id) values (1);

insert into message (body, car_id, conversation_id) values ('Im interesting in Honda Civic', 1, 1);
insert into message (body, car_id, conversation_id) values ('Im interesting in Toyto Camry', 2, 1);