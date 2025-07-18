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

-- 다이어리 title,dueDate 수정
-- update diary set title = ?, dueDate = ? where dno = ?

-- 로그인~
-- select * from member where memberId = ? and memberPwd = ?member

-- memberId로 글 목록 조회
-- select * from diary where writer = ?

delete from diary where writer = '박씨'; 
delete from diary where writer = '유지니';

-- 내일이 마감인 목록
select * from diary where dueDate = date_add(curdate(), interval 1 day);

update diary set dueDate = '2025-04-15' where dno = 9;
update diary set dueDate = '2025-04-15' where dno = 6;

-- 멤버 아이디로 이메일 조회
-- select email frommember where memberId = ?

select * from member;

update member set email = 'jina_1226@naver.com' where memberId = 'jina';
update member set email = 'ujin2597.u@gmail.com' where memberId = 'park';
