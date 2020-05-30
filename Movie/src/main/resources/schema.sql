CREATE TABLE if not exists users (
  user_id uuid NOT NULL,
  first_name varchar(50) NOT NULL,
  last_name varchar(50),
  CONSTRAINT users_pk PRIMARY KEY (user_id)
);

