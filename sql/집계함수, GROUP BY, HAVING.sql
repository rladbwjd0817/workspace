
# 집계 함수, GROUP BY, HAVING
# 단일행함수 - 각 행마다 하나의 결과를 가지는 함수
# 집계 함수 - 함수 실행결과 무조건 하나의 행 결과를 가지는 함수 
# 집계 함수 종류 : SUM(), MIN(), MAX(), COUNT() - 데이터 수, AVG()

# !!!단일행함수 및 일반 컬럼 조회는 집계함수와 함께 사용 시 주의가 필요!!!
# => 데이터의 갯수 및 평균을 구할 때는 NULL 데이터는 제외하여 계산함!

# EX) 테이블에 데이터가 10개 존재 -> 함수 실행 결과 조회 데이터도 10개
SELECT COMM, IFNULL(COMM, 10) FROM EMP; #단일행 함수의 예시
SELECT SUM(SAL) FROM EMP; #집계함수의 예시

#집계함수
SELECT SUM(SAL), MIN(SAL), MAX(SAL), COUNT(SAL), AVG(SAL) FROM EMP;

#EX) 직급이 과장인 사원들의 급여의 평균을 조회하세요.
SELECT ROUND(AVG(SAL), 1)
  FROM EMP
 WHERE JOB = '과장';

# !!COUNT(), AVG() 집계함수 사용 시 NULL 데이터 주의!!
# 데이터의 갯수 및 평균을 구할 때는 NULL 데이터는 제외하여 계산함!

# COUNT() -> EMP 테이블에 저장된 데이터 갯수를 구하는 것, 컬럼에 존재하는 데이터의 수를 파악하는 목적이 아님!
# 결론 : COUNT() 함수 안의 컬럼은 NULL 데이터가 포함된 컬럼은 가급적 사용하면 안 됨!
#     : NULL 데이터가 들어오지 않는 컬럼을 넣어야 함! 
#       => 'PRIMARY KEY' 컬럼을 사용한다!!
 
SELECT COUNT(EMPNO), COUNT(ENAME), COUNT(COMM) FROM EMP;

# EMP 테이블에 저장된 데이터의 갯수를 조회
SELECT COUNT(EMPNO) FROM EMP;

# 커미션 평균 조회
# AVG() 함수는 평균 구할 때 NULL 데이터는 갯수에서 생략 후 계산!
SELECT AVG(COMM), SUM(COMM), COUNT(COMM) FROM EMP;

# 사원이 10명, 이 중 영업부가 5명. 영업부만 인센티브가 있음. -> 어떤 평균을 구할 지 애매함.

# 커미션의 평균을 조회하되, 모든 사원 수를 기준으로 평균을 조회하라. 소수점 2째 자리까지 반올림
# 방법 : 인센이 NULL이면 -> 0으로 변경 후 계산
SELECT ROUND(AVG(IFNULL(COMM, 0)), 2) FROM EMP;

# !!!단일행함수 및 일반 컬럼 조회는 집계함수와 함께 사용 시 주의가 필요!!!
# 주의 : 조회하는 모든 컬럼은 반드시 조회되는 데이터의 행 갯수가 동일해야 조회 가능함!
# => 결론 : 집계함수는 단일행 함수 및 일반 컬럼이랑 함께 조회할 수 없음! 

#EX) 조회하는 모든 컬럼의 조회 갯수가 14개로 동일하기 때문에 조회 가능!
SELECT EMPNO, ENAME, SAL, COMM FROM EMP ;

#EX) 조회하는 모든 컬럼의 조회 갯수가 1개로 동일하기 때문에 조회 가능!
SELECT MAX(SAL), MIN(SAL), SUM(SAL) FROM EMP;

#EX) 모든 사원의 급여 정보와 사원들의 급여 합을 조회하세요.
# -> 애초에 질의문 자체가 허용되지 않는 질의...
SELECT SAL, SUM(SAL) FROM EMP; # 잘못된 결과를 조회!
# 이 조건을 지키지 않으면 ORACLE 쿼리에선 오류남


#################################################################################################

# GROUP BY - 특정 기준에 따라 그룹을 묶어 집계 데이터를 조회할 때 사용, 집계 함수와 함께 사용
# 모든 사원의 급여 평균 조회
SELECT AVG(SAL) FROM EMP;

# 직급별 사원의 급여 평균을 조회
# GROUP BY 절을 사용하면 SELECT 절에 GROUP 절의 그룹화 기준이 되는 컬럼은 사용 가능!
SELECT JOB, AVG(SAL)
  FROM EMP 
 GROUP BY JOB;

# 부서멸 최고 급여 및 최저 급여를 조회
# MAX() 괄호 안 문자가 오면 오름차순 기준으로 'ㅎ'으로 갈 수록 큰 글자!
SELECT DEPTNO, MAX(SAL), MIN(SAL), MAX(JOB)
  FROM EMP
 GROUP BY DEPTNO;

# HAVING - GROUP BY 결과 그룹화 되는 데이터를 기준으로 조건을 부여할 때 사용
#EX) 부서번호가 30번이 아닌 부서에 소속된 사원들의 직급별 최고 급여와 최저 급여의 차이를 조회
SELECT JOB, MAX(SAL) - MIN(SAL)
  FROM EMP
 WHERE DEPTNO != 30
 GROUP BY JOB

SELECT SAL, DEPTNO
  FROM EMP
 WHERE JOB = '과장';

# EX) 부서별 사원 수를 조회하되, 사원수가 4명 미만인 부서는 조회하지 않는다.
SELECT DEPTNO, COUNT(DEPTNO)
  FROM EMP 
 GROUP BY DEPTNO
HAVING COUNT(EMPNO) >= 4;  

# Q. 사번이 짝수인 사원들에 대해 부서별로 급여의 합 및 평균을 조회하되, 부서별 급여의 합이 300이상인 데이터만 조회하고, 부서번호 기준 내림차순으로 정렬
SELECT DEPTNO, SUM(SAL), AVG(SAL)
  FROM EMP
 WHERE MOD(EMPNO, 2) = 0 
 GROUP BY DEPTNO
HAVING SUM(SAL) >= 300
 ORDER BY DEPTNO DESC;

# SELECT 쿼리 문의 해석 순서(컴퓨터가 해석하는 순서)
# FROM -> WHERE -> GROUP BY -> HAVING -> SELECT -> ORDER BY
 
 
SELECT * FROM EMP;
