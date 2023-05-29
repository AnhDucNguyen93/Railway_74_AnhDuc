CREATE DATABASE IF NOT EXISTS assignment_1;
USE assignment_1;
CREATE TABLE department (
	departmentId INT AUTO_INCREMENT PRIMARY KEY,
    departmentName Varchar(255) NOT NULL
);
CREATE TABLE position (
	positionId int AUTO_INCREMENT PRIMARY KEY,
    positionName ENUM('Dev', 'Test', 'Scrum Master','PM')
);
CREATE TABLE `account` (
	accountId INT AUTO_INCREMENT PRIMARY KEY,
    email varchar(255),
    userName VARCHAR(255) UNIQUE KEY NOT NULL,
    fullName VARCHAR(255) UNIQUE KEY NOT NULL,
    departmentId INT,
    FOREIGN KEY (departmentId) REFERENCES department (departmentId),
    positionId INT,
    FOREIGN KEY (positionId) REFERENCES position (positionId),
    createDate DATE
);
-- ALTER TABLE account RENAME `account`;
CREATE TABLE `Group` (
	groupId INT AUTO_INCREMENT PRIMARY KEY,
    groupName VARCHAR(255) NOT NULL,
    createId INT,
    foreign key (createId) REFERENCES `account` (accountId),
    createDate Date
);
CREATE TABLE groupAccount (
	groupId INT,
    FOREIGN KEY (groupId) REFERENCES `Group`(groupId),
    accountId INT,
        FOREIGN KEY (accountId) REFERENCES `account`(accountId),
	joinDate DATE
);
CREATE TABLE typeQuestion (
	typeId INT AUTO_INCREMENT PRIMARY KEY,
    typeName varchar(255) not null
);
CREATE TABLE categoryQuestion (
	categoryId INT AUTO_INCREMENT PRIMARY KEY,
    categoryName VARCHAR(255) NOT NULL
);
CREATE TABLE question (
	questionId INT AUTO_INCREMENT PRIMARY KEY,
    conten VARCHAR(255),
    categoryId INT,
    FOREIGN KEY (categoryId) REFERENCES categoryQuestion (categoryId),
    typeId INT,
        FOREIGN KEY (typeId) REFERENCES typeQuestion (typeId),
	cretorId INT,
     foreign key (cretorId) REFERENCES `account` (accountId),
     createDate DATE
);
CREATE TABLE answer (
	answerId INT AUTO_INCREMENT PRIMARY KEY,
    conten VARCHAR(255) not NULL,
    questionId INT,
    FOREIGN KEY (questionId) REFERENCES question (questionId),
    isCorrect ENUM('Dung', 'Sai')
);
CREATE TABLE exam (
	examId INT AUTO_INCREMENT PRIMARY KEY,
    `code` VARCHAR(50) NOT NULL,
    title VARCHAR(255) NOT NULL,
    categoryId INT,
		FOREIGN KEY (categoryId) REFERENCES categoryQuestion (categoryId),
    duration TIME,
    creatorId INT,
        FOREIGN KEY (creatorId) REFERENCES `account` (accountId),
	createDate DATE
);
CREATE TABLE examQuestion (
	examId INT,
    FOREIGN KEY (examId) REFERENCES exam (examId),
    questionId INT,
    FOREIGN KEY (questionId) REFERENCES question (questionId)
);