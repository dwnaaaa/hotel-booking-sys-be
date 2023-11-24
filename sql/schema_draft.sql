CREATE TABLE BRN_TABLE (
    BRN_ID              VARCHAR2(6) NOT NULL,
    PRIMARY_GUEST_ID    VARCHAR2(6) NOT NULL,
    BOOKING_DATE        DATE NOT NULL,
    CHECK_IN_DATE       DATE NOT NULL,
    CHECK_OUT_DATE      DATE,
    ROOM_TYPE           NUMBER(1,0) NOT NULL,
    NO_OF_ROOMS         NUMBER(2,0) NOT NULL,
    CONSTRAINT BRN_TABLE_PK PRIMARY KEY (BRN_ID),
    CONSTRAINT BRN_TABLE_FK1 FOREIGN KEY (ROOM_TYPE) REFERENCES ROOM_TYPE (ROOM_TYPE_ID),
    CONSTRAINT BRN_TABLE_FK2 FOREIGN KEY (PRIMARY_GUEST_ID) REFERENCES GUEST_TABLE (GUEST_ID)
);

CREATE TABLE BRN_GUEST_TABLE (
    BRN_ID              VARCHAR2(6) NOT NULL,
    GUEST_ID            VARCHAR2(6) NOT NULL,
    CONSTRAINT BG_TABLE_PK PRIMARY KEY (BRN_ID, GUEST_ID),
    CONSTRAINT BG_TABLE_FK1 FOREIGN KEY (BRN_ID) REFERENCES BRN_TABLE (BRN_ID),
    CONSTRAINT BG_TABLE_FK2 FOREIGN KEY (GUEST_ID) REFERENCES GUEST_TABLE (GUEST_ID)
);

CREATE TABLE BRN_ROOM_TABLE (
    BRN_ID              VARCHAR2(6) NOT NULL,
    ROOM_NUMBER         NUMBER(3,0) NOT NULL,
    CONSTRAINT BR_TABLE_PK PRIMARY KEY (BRN_ID, ROOM_NUMBER),
    CONSTRAINT BR_TABLE_FK1 FOREIGN KEY (BRN_ID) REFERENCES BRN_TABLE (BRN_ID),
    COSNTRAINT BR_TABLE_FK2 FOREIGN KEY (ROOM_NUMBER) REFERENCES ROOM (ROOM_NUMBER)
);

CREATE TABLE GUEST_TABLE (
    GUEST_ID            VARCHAR2(6) NOT NULL,
    FIRST_NAME          VARCHAR2(20) NOT NULL,
    MIDDLE_NAME         VARCHAR2(20) NOT NULL,
    LAST_NAME           VARCHAR2(20) NOT NULL,
    BIRTHDAY            DATE NOT NULL,
    AGE                 NUMBER(3,0) NOT NULL,
    STREET              VARCHAR2(20) NOT NULL,
    CITY                VARCHAR2(20) NOT NULL,
    STATE               VARCHAR2(20) NOT NULL,
    ZIP_CODE            NUMBER(4,0) NOT NULL,
    ROOM_NO             NUMBER(3,0) NOT NULL,
    CONSTRAINT BRN_TABLE_PK PRIMARY KEY (GUEST_ID),
    CONSTRAINT BRN_TABLE_FK FOREIGN KEY (ROOM_NO) REFERENCES ROOM (ROOM_NO)
);

CREATE TABLE BILL_PAYMENT_TABLE (
    BP_ID               VARCHAR2(6) NOT NULL,
    BRN_ID              VARCHAR2(6) NOT NULL,
    TOTAL               NUMBER(6,0) NOT NULL,
    CONSTRAINT BP_TABLE_PK PRIMARY KEY (BP_ID),
    CONSTRAINT BP_TABLE_FK FOREIGN KEY (BRN_ID) REFERENCES BRN_TABLE (BRN_ID)
)

CREATE TABLE ROOM
(
    ROOM_NUMBER NUMBER(3, 0) PRIMARY KEY,
    ROOM_TYPE NUMBER (1,0) NOT NULL,
    BRN_ID VARCHAR2(6) NOT NULL,
    ROOM_TYPE_ID NUMBER (1,0) NOT NULL,
    CONSTRAINT ROOM_TYPE_FK FOREIGN KEY (ROOM_TYPE_ID) REFERENCES ROOM_TYPE, 
    CONSTRAINT BRN_ID_FK FOREIGN KEY (BRN_ID) REFERENCES BRN_TABLE,
)

CREATE SEQUENCE ROOM_SEQ
START WITH 1;
INCREMENT BY 1;


CREATE TABLE ROOM_TYPE
(
    ROOM_TYPE_ID NUMBER (1,0) PRIMARY KEY,
    ROOM_TYPE_NAME VARCHAR2(50) NOT NULL,
    BED_TYPE VARCHAR2(50) NOT NULL,
    ROOM_TYPE_DESC VARCHAR2(100) NOT NULL,
    PRICE NUMBER (5, 0) NOT NULL,
    SERVICES VARCHAR2(50) NOT NULL,
    MAX_GUEST NUMBER (2, 0) NOT NULL,
    NO_OF_BEDS NUMBER (2, 0) NOT NULL,
    AREA NUMBER (3, 0) NOT NULL,
)

CREATE SEQUENCE ROOM_TYPE_SEQ
START WITH 1;
INCREMENT BY 1;

CREATE TABLE EMPLOYEE_TABLE
( 
    EMPLOYEE_ID   NUMBER(11,0) PRIMARY KEY, 
    FIRST_NAME    VARCHAR2(20),
    MIDDLE_NAME   VARCHAR2(25),
    LAST_NAME     VARCHAR2(25),
    EMPLOYEE_TYPE NUMBER(1,0),
    CONSTRAINT    EMPLOYEE_TYPE_FK FOREIGN KEY (EMPLOYEE_TYPE_ID) REFERENCES EMPLOYEE_TYPE_TABLE,
) ;

CREATE SEQUENCE EMPLOYEE_SEQ
START WITH 1;
INCREMENT BY 1;

CREATE TABLE EMPLOYEE_TYPE_TABLE
    ( EMPLOYEE_TYPE_ID NUMBER(1,0) PRIMARY KEY
    , TYPE_NAME VARCHAR2(20)
    )

CREATE SEQUENCE EMPLOYEE_TYPE_SEQ
START WITH 1;
INCREMENT BY 1;

CREATE TABLE SERVICE_TABLE
    (   SERVICE_ID          NUMBER(11,0) PRIMARY KEY,
        SERVICE_T           VARCHAR2(50)  NOT NULL,
        CONSTRAINT          SERVICE_T    FOREIGN KEY (SERVICE_NAME) REFERENCES SERVICE_TYPE 
    )

CREATE SEQUENCE SERVICE_SEQ
START WITH 1;
INCREMENT BY 1;

CREATE TABLE SERVICE_TYPE
(   
    SERVICE_NAME        VARCHAR2(50)   PRIMARY KEY,
    PRICE               NUMBER(11,0)  NOT NULL,
    DESCRIPTION         VARCHAR2(100) NOT NULL,
)