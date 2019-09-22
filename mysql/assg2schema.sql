select count(*) from rooms where building = "117" and capacity >=20 and capacity <=40;
select staff.id, phone from staff, rooms where staff.office = rooms.id and building = "121" group by staff.id;
select rooms.name, rooms.id from rooms, buildings where rooms.building = buildings.id and buildings.campus = "K" and rooms.capacity = max(rooms.capacity) group by rooms.id;
select STAFF.id where STAFF.id = ROOMS.id and ROOM.capacity > avg(capacity);


