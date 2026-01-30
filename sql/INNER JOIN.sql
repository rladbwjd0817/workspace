
# 별칭 사용법

SELECT EMP.EMPNO, EMP.ENAME, EMP.SAL
  FROM EMP;

# 테이블에 별칭 줄 땐 AS 키워드 붙이지 말자!
# 별칭은 간결하게 쓰기위한 용도로 짧게 작성함.
SELECT EMPNO, ENAME, SAL
  FROM EMP E;

# JONG(조인): 둘 이상의 데이터를 동시에 조회할 때 사용하는 문법
SELECT * FROM EMP;
SELECT * FROM DEPT;
DESC EMP;

# CROSS JOIN - 사용 못하는 조인
# 사번, 사원명, 급여, 부서명, 지역 조회 - 테이블도 , 쓰고 나열
# 두 테이블에 중복으로 존재하는 컬럼 조회 시 주의가 필요함! 
# -> 어떤 테이블에서 중복 데이터를 조회 할 것인지 애매모호해져서 오류남
SELECT EMPNO, ENAME, SAL, DNAME, LOC, EMP.DEPTNO, DEPT.DEPTNO
  FROM EMP, DEPT;

# INNER JOIN
# 조건을 넣어 유효한 데이터를 뽑아내는 것
# 조인 조건 : 조인하고자 하는 두 테이블이 공통적으로 가진 같은 값만 조회한다는 조건 추가
SELECT EMPNO, ENAME, SAL, DNAME, LOC, EMP.DEPTNO, DEPT.DEPTNO
  FROM EMP, DEPT
 WHERE EMP.DEPTNO = DEPT.DEPTNO;

# 직급이 사원이 아닌 직원의 사번, 사원명, 직급, 부서번호, 부서명을 조회
SELECT EMPNO, ENAME, JOB, EMP.DEPTNO, DNAME  
  FROM EMP, DEPT
 WHERE EMP.DEPTNO = DEPT.DEPTNO,
   AND JOB != '사원';

# 부서번호가 10번 혹은 20번인 직원의 사번, 사원명, 부서명, 부서의 지역을 조회
SELECT EMPNO, ENAME, DNAME, LOC  
  FROM EMP E, DEPT D
 WHERE E.DEPTNO = D.DEPTNO
   AND E.DEPTNO IN (10, 20);
   # AND (E.DEPTNO = 10 OR E.DEPTNO = 20);
	     
# ANSI 문법의 JOIN.
# ANSI : 국제표준으로 만들어 놓은 SQL 문법
# ANSI문법은 국제표준이기 때문에 DB종류와 상관없이 모든 디비에서 공통으로 사용할 수 있는 문법
# 위에서 배운 JOIN 문법은 ORACLE, MARIADB, MYSQL 디비의 JOIN 문법
SELECT EMPNO, ENAME, E.DEPTNO, DNAME
  FROM EMP E INNER JOIN DEPT D
    ON E.DEPTNO = D.DEPTNO;
