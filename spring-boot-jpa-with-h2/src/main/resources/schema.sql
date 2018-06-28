CREATE TABLE CONTACT (
CONTACT_ID BIGINT PRIMARY KEY);

CREATE TABLE PRODUCT(
--PRODUCT_ID BIGINT  PRIMARY KEY,
PRODUCT_NAME VARCHAR(30) PRIMARY KEY);

CREATE TABLE APPLICATION(
APPLICATION_ID BIGINT  PRIMARY KEY,
CONTACT_ID BIGINT,
constraint fk_ap_con FOREIGN KEY (CONTACT_ID) REFERENCES CONTACT(CONTACT_ID),
--product_id bigint,
--constraint fk_ap_prodid FOREIGN KEY (PRODUCT_id) REFERENCES PRODUCT(PRODUCT_id),
DT_CREATED DATE,
PRODUCT_NAME VARCHAR,
constraint fk_ap_prod FOREIGN KEY (PRODUCT_NAME) REFERENCES PRODUCT(PRODUCT_NAME)

);