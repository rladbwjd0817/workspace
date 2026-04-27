# VIEW - 가상테이블,  많이 씀, 신입들이 VIEW를 많이 활용
# SPRING에서도 똑같이 사용가능 - DTO클래스와 XML의 RESULT MAP을 그대로 사용 가능
# INSERT, DELETE, UPDATE 조건에 따라 가능하나 VIEW와 연결된 테이블에 영향을 미침 그래서 거의 안씀!
# DROP VIEW 뷰명
# VIEW 사용 이용
# 1. 민감한 데이터를 감추기 위해 - 권한이 없는 사람한테 감출 수 있음
# 2. 복잡한 조회 쿼리(조인)를 편하게 사용하기 위해

# VIEW 생성
# 주의 - V_EMP라는 테이블이 생성되고, 여기에 조회한 데이터가 삽입되는구나 => X
CREATE OR REPLACE VIEW V_EMP AS 
SELECT EMPNO, ENAME, JOB # SELECT한 데이터가 가상 테이블에 들어감
  FROM EMP
 WHERE JOB != '사장';

SELECT * FROM V_EMP;


###--------------------------------------------------------------------###
# 사원번호, 사원명, 부서번호, 부서명을 조회
SELECT EMPNO, ENAME, E.DEPTNO, DNAME
  FROM EMP E INNER JOIN DEPT D
    ON E.DEPTNO  = D.DEPTNO;

# 기능을 만들 때 마다 조인이 필요하다면 이미 조인된 데이터를 VIEW로 생성
CREATE OR REPLACE VIEW V_EMP_INFO
AS
SELECT EMPNO, ENAME, JOB, HIREDATE, SAL, COMM, E.DEPTNO
	, DNAME, LOC
  FROM EMP E INNER JOIN DEPT D
    ON E.DEPTNO  = D.DEPTNO;

SELECT * FROM V_EMP_INFO;
# 기능1. 급여가 300이상인 사원들의 사원번호, 사원명, 부서번호, 부서명을 조회
SELECT EMPNO, ENAME, DEPTNO, DNAME
  FROM V_EMP_INFO
 WHERE SAL >= 300;

# 기능2. 직급이 사원, 대리, 과장인 사원번호, 사원명, 부서번호, 부서명을 조회
# 기능3. COMM받는 사원들의 사원번호, 사원명, 부서번호, 부서명 조회
