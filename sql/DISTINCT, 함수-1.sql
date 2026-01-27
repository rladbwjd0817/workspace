
# 중복 제거(distinct)
SELECT JOB FROM emp;

#ex) emp 테이블에서 저장된 직급의 종류를 조회
SELECT DISTINCT job FROM emp;

#ex) emp 테이블에서 저장된 부서번호 조회(중복제거하고)
SELECT DISTINCT deptno FROM emp;

#distinct 키워드는 하나만 붙이면 조회하는 모든 컬럼에 적용
#조회하는 컬럼이 2개 이상이면 조회 선택된 컬럼이 모두 중복되면 제거됨.
SELECT DISTINCT job, deptno FROM emp;

SELECT * FROM emp;
#################################################################################################

# 1. 수치관련 함수
#ceil : 올림, floor : 버림(정수로만), round : 반올림
SELECT ceil(70.3), FLOOR(70.7), ROUND(70.5);

# MOD연산자 : 나머지
SELECT MOD(10,3);

# EMP 테이블에서 사번이 짝수인 사원의 모든 정보를 조회
SELECT *
  FROM EMP
 WHERE MOD(EMPNO ,2) = 0
 
 # TRUNCATE(숫자, 소수점자리) : 소수점 자리까지 버림
SELECT TRUNCATE(123.456, 1)
	, TRUNCATE(123.456, 2)
	, ROUND(123.456)
	, ROUND(123.456, 1); #ROUND도 두번째 매개변수 자리에 소수점 자리를 컨트롤 할 수 있음
	
# 문자 관련 함수
# 1. 문자 일부 추출할 수 있는 함수
#SUBSTR(), SUBSTRING() -> 차이점 없음
SELECT SUBSTR('ABCDEF', 3)
	, SUBSTR('ABCDEF', 2, 3) #2번째 글자부터 글자 3개 가지고 옴
	, SUBSTRING('ABCDEF', 3)
	, SUBSTRING('ABCDEF', 2, 3);

# 2. 대소문자 변경함수
# UPPER(문자) : 대문자로 변경, LOWER(문자) : 소문자로 변경
SELECT UPPER('Hllo World');
SELECT LOWER('Hllo World');

# 3. 공백 제거
# TRIM(문자), LTRIM(문자), RTIRM(문자)
SELECT TRIM('  DB  '), LTRIM('  DB       A'), RTRIM('  DB  ');

# 4. 글자 수 및 크기 확인 
# CHAR_LENGTH->  몇 글자 인지
# 영어 -> 1바이트, 한글 -> 3바이트(DB마다 다름)
SELECT CHAR_LENGTH('HELLO'), LENGTHB('HELLO'), LENGTHB('안녕');

# 5. 문자 나열 함수
SELECT CONCAT('A', 'B', 'C');
SELECT CONCAT(ENAME, '직원은 급여가', SAL) FROM  EMP;

# 6. 자릿수 채우기
# LPAD(문자, 글자수, 채울 문자)
# RPAD(문자, 글자수, 채울 문자)
SELECT LPAD('ABC', 5, '1') , RPAD('ABC', 5, '1');

# 7. 문자 대체 함수
SELECT REPLACE('나는 걷기를 잘한다', '걷기', '누워있기');

# !!!!!!!!!!!! 8. 논리함수  -> 시험나옴!!!!
# 8-1. IF(조건, 참일 때 값, 거짓일 때 값) <aka. 삼항연산자>
SELECT IF(10 < 2, '참', '거짓');

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! 8-2. IFNULL(데이터, NULL 일 때 대체 데이터) : NULL값 체크 -> 시험나옴 !!!!!!!!!!!!!!!
# ORACLE 디비에서는 IFNULL 함수 없음. 대신 NVL(COMM, 0) FROM EMP사용!
SELECT EMPNO, ENAME, COMM, IFNULL(COMM, 0), NVL(COMM, 0) FROM EMP;

# !!!!!!!!!!시험!!!!!8-3. CASE 문법 -> 시험!!
# ex) 부서번호가 10 -> 개발부, 부서번호가 20 -> 영업부, 부서번호30->인사부;

# SELECT ENAME, DEPTNO, if(DEPTNO = 10, '개발부', 영업부) AS '부서명' FROM EMP;
SELECT ENAME
	, DEPTNO
	, CASE DEPTNO
		WHEN 10 THEN '개발부'
		WHEN 20 THEN '영업부'
		ELSE '인사부' 
	  END AS 부서명
	  , CASE 
			WHEN DEPTNO =10 THEN '개발부'
			WHEN DEPTNO =20 THEN '영업부'
			ELSE '인사부' 
	  	END 부서명
  FROM EMP;

#######################################################################################################
# 연습문제

CREATE TABLE BOOK_STORE (
    BOOK_ID INT PRIMARY KEY,        -- 도서 번호
    TITLE VARCHAR(100),             -- 도서 제목
    AUTHOR VARCHAR(50),             -- 저자
    CATEGORY VARCHAR(20),           -- 카테고리
    PRICE DECIMAL(10, 2),           -- 가격
    STOCK INT,                      -- 재고 수량
    DISCOUNT_RATE DOUBLE            -- 할인율 (예: 0.15는 15%)
);

INSERT INTO BOOK_STORE VALUES 
(101, '  Java Programming  ', 'KIM', 'IT', 35000.55, 12, 0.1),
(102, 'Python Master', 'LEE', 'IT', 28000.40, 5, 0.2),
(103, 'SQL Beginner', 'PARK', 'DB', 22000.00, 3, NULL),
(104, 'The Great Gatsby', 'F. Scott', 'NOVEL', 15000.80, 8, 0.05),
(105, 'Data Science 101', 'CHOI', 'IT', 42000.00, 0, 0.3),
(106, 'Learning SQL', 'KIM', 'DB', 31000.25, 11, NULL);

SELECT * FROM BOOK_STORE;


# [Part 1: 중복 제거 및 수치 함수]
# BOOK_STORE 테이블에 있는 카테고리의 종류를 중복 없이 조회하세요.
SELECT DISTINCT CATEGORY FROM BOOK_STORE;
# 모든 도서의 가격(PRICE)을 소수점 첫째 자리에서 반올림하여 조회하세요.
SELECT ROUND(PRICE, 1) FROM BOOK_STORE;
# 도서 번호(BOOK_ID)가 홀수인 도서들의 제목과 저자를 조회하세요.
SELECT TITLE, AUTHOR
  FROM BOOK_STORE
 WHERE MOD(BOOK_ID, 2) != 0;
# 가격(PRICE)을 소수점 이하를 버리고(FLOOR) '정수가격'이라는 별칭으로 조회하세요.
SELECT FLOOR(PRICE) 정수가격 FROM BOOK_STORE;

#[Part 2: 문자 함수]
# 도서 제목(TITLE)의 좌우 공백을 제거하고, 모두 대문자로 변환하여 조회하세요.
SELECT TRIM(TITLE), UPPER(TITLE) FROM BOOK_STORE;
SELECT UPPER(TRIM(TITLE)) FROM BOOK_STORE;

# 저자(AUTHOR)의 이름이 3글자 이상이라면, 앞의 2글자만 추출하여 조회하세요.
SELECT IF(CHAR_LENGTH(AUTHOR) >= 3, SUBSTR(AUTHOR, 1, 2), AUTHOR) FROM BOOK_STORE;

# 제목(TITLE)에 있는 'SQL'이라는 단어를 'DATABASE'로 교체하여 조회하세요.
SELECT REPLACE(TITLE, 'SQL', 'DATABASE') FROM BOOK_STORE;
# 저자(AUTHOR) 이름의 오른쪽에 '*'를 채워 총 5글자로 만드세요. (예: KIM -> KIM**)
SELECT RPAD(AUTHOR, 5, '*') FROM BOOK_STORE;
#글자수가 초과하면 뒤에 글자 짤림

#[Part 3: 논리 및 NULL 처리]
# DISCOUNT_RATE(할인율)가 NULL인 경우 0으로 표시하고, '할인율'이라는 별칭으로 조회하세요.
SELECT IFNULL(DISCOUNT_RATE, 0) 할인율 FROM BOOK_STORE;
# IF 함수를 사용하여 재고(STOCK)가 0이면 '품절', 아니면 **'판매중'**이라고 표시되는 컬럼을 추가하세요.
SELECT *, IF(STOCK = 0, '품절', '판매중') FROM BOOK_STORE;
# CASE 문을 사용하여 카테고리별 위치를 출력하세요.
# IT -> 1층 로비
# DB -> 2층 사무실
# NOVEL -> 3층 서고
# 그 외 -> 기타
SELECT DISTINCT CATEGORY,
	CASE CATEGORY 
		WHEN 'IT' THEN '1층 로비'
		WHEN 'DB' THEN '2층 사무실'
		WHEN 'NOVEL' THEN '3층 서고'
		ELSE '기타'
	END AS '위치'
   FROM BOOK_STORE; 

SELECT * FROM BOOK_STORE;
	
		 





