
-- 이것은 주석입니다.
# 이것은 주석입니다.

# 데이터 조회
# SELECT 조회할컬럼 FROM 테이블명;

# EMP 테이블에서 사원들의 사원명을 조회
SELECT ENAME FROM emp;

#EMP 테이블에서 사원들의 사번, 사원명을 조회
SELECT EMPNO, ENAME FROM emp;

#EMP테이블의 사원들의 모든 정보를 조회
SELECT * FROM emp;

#데이터 조회 시 무조건 컬럼만 조회할 수 있는건 아님!
#필요한 숫자나 문자열도 조회가능함!
SELECT EMPNO, JOB, 3, '봄날', 3 + 3 FROM emp;

#별칭을 사용하여 데이터 조회
#EMP테이블에서 사번을 조회하되, 'NUMBER'라는 별칭으로 조회
SELECT EMPNO AS NUMBER FROM emp;

#EMP테이블에서 사원들의 사원명, 급여, 입사일을 조회
#단, 순서대로 이름, 월급, 입사일이라는 별칭으로 조회
SELECT ENAME AS 이름, SAL AS 월급, HIREDATE AS 입사일 FROM emp;

#별칭 사용시 AS 키워드는 생략 가능
SELECT ENAME 이름 FROM emp;

#조회 시 조건 추가(특정조건에 맞는 사람)
#사원 중에서 급여가 300이상인 사원들의 사번, 사원명, 급여 정보를 조회
SELECT EMPNO, ENAME, SAL 
FROM emp 
WHERE SAL >= 300;

#사원중에서 직급이 대리인 사원의 사번, 직급, 사원명을 조회
# = 같다, !=, <> 다르다
SELECT EMPNO, JOB, ENAME  
FROM emp
WHERE JOB = '대리';

#SELECT
#  FROM
# WHERE
# GROUP BY
#HAVING

# 사원 중에서 급여가 400이상이면서 800이하인 사원들의 모든 정보 조회
SELECT *
  FROM emp
 WHERE SAL >= 400 AND SAL <= 800;
 
# AND : 그리고, OR : 또는, 이거나

#사원 중에서 사번이 1005이상이거나 직급이 사원이 아닌 직원들의 사번, 사원명, 직급, 입사일 조회
SELECT EMPNO, ENAME, JOB, HIREDATE
  FROM emp
 WHERE EMPNO <= 1005 OR JOB != '사원';
 
 SELECT * FROM emp;
 #사원 중에서 COMMITION이 NULL인 직원들의 사원명, 커미션을 조회
 # NULL 체크는 등호 기호 사용하지 않고, 
 # 널이다 -> IS NULL, 널이 아니다-> IS NOT NULL 
 SELECT ENAME, COMM
   FROM emp
  WHERE COMM IS NULL;
  
  #1번 문제
  SELECT EMPNO, ENAME, SAL, COMM 
    FROM emp;
    
  #2번 문제
  SELECT EMPNO, ENAME AS NAME, JOB
    FROM emp
   WHERE EMPNO >= 1005;
   
  #3번 문제
  SELECT ENAME, JOB, SAL
    FROM EMP
   WHERE JOB = '대리' OR JOB = '과장';
   
  #4번 문제
  SELECT *
    FROM EMP
   WHERE SAL >= 300 AND COMM >= 300;
   
  #5번 문제
  SELECT ENAME, JOB, SAL, COMM
    FROM EMP
   WHERE SAL <= 900 
	   AND COMM IS NOT NULL 
		 AND (JOB = '대리' OR JOB = '과장');
		 
#	10 > 3 AND 10 > 1 OR 1 < 3
# OR 다음 AND!  








