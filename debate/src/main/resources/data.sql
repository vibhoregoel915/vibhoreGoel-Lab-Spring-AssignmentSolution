INSERT INTO `bootdebate`.`roles` (`role_id`, `role_name`) VALUES ('1', 'ADMIN');
INSERT INTO `bootdebate`.`roles` (`role_id`, `role_name`) VALUES ('2', 'USER');
INSERT INTO `bootdebate`.`roles` (`role_id`, `role_name`) VALUES ('3', 'CLERK');


INSERT INTO `bootdebate`.`users` (`user_id`, `password`, `username`) VALUES ('1', '$2a$12$R8w21FaWOcCnCmu8KtEUQOh97v.DvFkmgP9pIcSM23MYApad4kruK', 'vibhu');
INSERT INTO `bootdebate`.`users` (`user_id`, `password`, `username`) VALUES ('2', '$2a$12$.jVpr4hwwMIwy.ZuUC6pKe5baT25GY0B9X0cBt58VsFyBTI/NgETm', 'raju');
INSERT INTO `bootdebate`.`users` (`user_id`, `password`, `username`) VALUES ('3', '$2a$12$FE3QLJowEOUGLVfF5fMazeUQfgDgQX8vvAaxzSueghQqs2pZ43E4u', 'om');
INSERT INTO `bootdebate`.`users` (`user_id`, `password`, `username`) VALUES ('4', '$2a$12$sv776b4aSJ6FVk/sT14KpOm9tSiXXtGlUQHxvfJNgk5ROHFcMMwzm', 'arpit');

INSERT INTO `user_roles` VALUES ('1', '1');
INSERT INTO `user_roles` VALUES ('4', '1');
INSERT INTO `user_roles` VALUES ('2', '3');
INSERT INTO `user_roles` VALUES ('3', '2');