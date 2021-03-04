delete from user;
delete from jobs;
delete from role;
INSERT INTO user VALUES (1,'Joe','Coyne','jcoyne','supersecret1'),(2,'Fred','Hensen','fhensen','supersecret2'),(3,'Barney','Curry','bcurry','supersecret3'),(4,'Karen','Mack','kmack','supersecret4'),(5,'Dianne','Klein','dklein','supersecret5'),(6,'Dawn','Tillman','dtillman','supersecret6');
INSERT INTO `jobs` VALUES (1,'Junior Web Devloper',1),(2,'Junior Java Developer',2),(3,'Front End Developer',2),(4,'Database Admin Internship',1),(5,'Data Scientist',4),(6,'Web Developer Internship for Summer',1),(7,'Am Fam Web Dev Internship',4);
INSERT INTO `role` VALUES (1,'admin','jcoyne', 1);