use park;
select * from member;
-- member 테이블 생성
-- CREATE TABLE `park`.`member` (
--   `memberId` VARCHAR(8) NOT NULL,
--   `memberPwd` VARCHAR(200) NOT NULL,
--   `email` VARCHAR(50) NOT NULL,
--   `memberName` VARCHAR(45) NOT NULL,
--   PRIMARY KEY (`memberId`),
--   UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE);

-- 아이디 중복검사
select count(*) from member where memberId = 'tosimi';
insert into member(memberId,memberPwd,email,memberName) values(?,?,?,?);


-- ---------------------------------------------------------------
-- diary 테이블 생성

-- CREATE TABLE `park`.`diary` (
--   `dno` INT NOT NULL AUTO_INCREMENT,
--   `title` VARCHAR(100) NOT NULL,
--   `dueDate` DATE NOT NULL,
--   `writer` VARCHAR(8) NOT NULL,
--   `finished` TINYINT NULL DEFAULT '0',
--   PRIMARY KEY (`dno`));

-- insert into diary (title,dueDate,writer) values (?,?,?)
select * from diary;

select * from diary order by dno desc;

update diary set finished = ? where dno = ?;