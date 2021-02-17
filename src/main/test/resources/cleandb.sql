DELETE FROM users;
DELETE FROM roles;
INSERT INTO `users` VALUES (1,'ctkrause','caleb','javaEnt'),(2,'ctkrause','Caleb Krause','Hibernate'),(3,'lSamuel','Levi Krause','Mechanic'),(4,'iNathaniel','Isaiah Krause','phlebotomist'),(5,'nCarl','Nathan Krause','preacher'),(6,'sAnn','Sheryl Krause','doctorOfNursing');
INSERT INTO `roles` VALUES (9,'Admin',1),(10,'Superuser',1),(11,'BasicUser',1),(12,'BasicUser',2),(13,'BasicUser',3),(14,'BasicUser',4),(15,'BasicUser',5),(16,'BasicUser',6);