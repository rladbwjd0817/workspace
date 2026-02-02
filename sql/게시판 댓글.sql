SELECT * FROM BASIC_BOARD;
# 댓글 테이블 생성 및 외래키
# 외래키(FOREIGN KEY / FK) 제약조건 
# - 한 테이블이 다른 테이블의 데이터를 참조할 때 사용하는 제약조건
# - FK 제약조건이 있어도 NULL 데이터는 들어올 수 있음!(주의!!)

# <FK 제약조건은 테이블 생성 시 추가 문법>
# 컬럼명 자료형 REFERENCES 참조테이블명 (참조컬럼명)
# -> 부모 테이블의 데이터를 삭제하려면 자식테이블의 데이터를 먼저 삭제하고 부모 테이블 삭제 가능
# 컬럼명 자료형 REFERENCES 참조테이블명 (참조컬럼명) ON DELETE CASCADE
# -> 부모 테이블의 데이터를 삭제하면 자동으로 자식 테이블의 데이터가 삭제 됨


# 제목에 자바가 포함된 게시글을 조회
# 검색하는 것만 대소문자만 만들 것이 아니라 검색할 제목들도 같이 대소문자로 맞춰줘야함.
# CONCAT('A', 'B', 'C'); -> 괄호 안에 있는 글자들 나열

# 특이사항
# 자식테이블에서 부모클래스의 컬럼값을 참조하고 있으면 부모 테이블의 데이터 삭제가 불가

#DROP TABLE BOARD_REPLY;

#댓글 정보 테이블 생성
CREATE TABLE BOARD_REPLY(
	REPLY_NUM INT PRIMARY KEY AUTO_INCREMENT
	, CONTENT VARCHAR(100) NOT NULL
	, WRITER VARCHAR(50) NOT NULL
	, REG_DATE DATETIME DEFAULT SYSDATE()
	, BOARD_NUM INT NOT NULL REFERENCES BASIC_BOARD (BOARD_NUM) ON DELETE CASCADE #게시글 지우면 해당 댓글들도 지워짐.
);

# 외래키에 NULL 값이 들어올 수 있기에 NOT NULL 제약조건도 넣어야 함!
# 외래키 연결되어 있는 기본키 데이터는 삭제 
# UNIQUE - 중복 불가

SELECT * FROM BASIC_BOARD;
SELECT * FROM BOARD_REPLY;

# 2번 게시글에 댓글 추가
INSERT INTO BOARD_REPLY VALUES(1, '난 배부른뎅', 'BB', SYSDATE(), 43);
INSERT INTO BOARD_REPLY VALUES(2, '밥버거 추천!', 'ay', SYSDATE(), 43);

# 2번 게시글 삭제 쿼리 -> 오류 발생(데이터의 무결성을 지켜주기 위해서 발생)
# 2번 게시글에 대한 댓글이 존재하기 때문에 2번 게시글 삭제 불가
# 만약 2번 게시글을 정말 삭제하려면 1) 2번 게시글에 달린 댓글을 모두 삭제 2) 2번 게시글 삭제
# 참조하는 자식테이블을 먼저 삭제 -> 부모테이블 삭제
DELETE FROM BASIC_BOARD WHERE BOARD_NUM = 2;

# 댓글 목록 조회
#SELECT REPLY_NUM
#	, WRITER
#	, CONTENT
#	, REG_DATE
# FROM BOARD_REPLY
#WHERE BOARD_NUM = #{boardNum}
#ORDER BY REG_DATE DESC;


