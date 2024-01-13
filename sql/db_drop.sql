
DROP TABLE BRN_SERVICES;
DROP TABLE BRN_ROOMS;
DROP TABLE BRN_GUEST;
DROP TABLE ROOM;
DROP SEQUENCE BP_SEQ;
DROP TABLE BILL_PAYMENT;
DROP TABLE BRN;
DROP TABLE ROOM_TYPE_SERVICE;
DROP TABLE SERVICES;
-- DROP TABLE PRODUCTS;
DROP TABLE USERS;
DROP SEQUENCE EMPLOYEE_SEQ;
DROP TABLE EMPLOYEE;
DROP TABLE EMPLOYEE_TYPE;
DROP SEQUENCE CARD_SEQ;
DROP TABLE CARD;
DROP TABLE BED_TYPE;
DROP TABLE ROOM_TYPE;
DROP SEQUENCE GUEST_SEQ;
DROP TABLE GUEST;


DROP FUNCTION GENERATE_RANDOM_ALPHANUMERIC;
DROP FUNCTION COMPUTE_AGE;
DROP FUNCTION CONVERT_TO_DATE;
DROP FUNCTION GENERATE_BRN;
DROP PROCEDURE ADD_BOOKING;
-- DROP FUNCTION GENERATE_GUEST_ID;
-- DROP PROCEDURE ADD_GUEST;
-- DROP FUNCTION GENERATE_CARD_ID;
-- DROP PROCEDURE ADD_CARD;
DROP PROCEDURE ADD_BILL_PAYMENT;


DROP VIEW GUEST_VIEW;


COMMIT;