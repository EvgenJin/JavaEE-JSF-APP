create or replace PACKAGE BODY TEST_PKG AS



    PROCEDURE count_todos (userName IN STRING,todosCout OUT NUMBER ) 
    AS 
    BEGIN 
        SELECT COUNT(*) INTO todosCout 
        FROM todos 
        WHERE USR = userName;
    END;
    
    PROCEDURE todosByUser (userName IN VARCHAR2,todosList OUT SYS_REFCURSOR )
    AS 
    BEGIN
        OPEN todosList FOR
        SELECT *
        FROM todos
        WHERE usr = userName;
    END;



END TEST_PKG;
