create table employer
(
    id          bigserial primary key,
    area_id      bigint not null,
    description text,
    name        varchar(255) not null
);

alter table employer
    owner to hh;

create table vacancy
(
    id           bigserial primary key,
    area_id       bigint,
    created_at    timestamp,
    name         text  not null,
    currency     text,
    start_salary double precision,
    gross        boolean,
    end_salary   double precision,
    employer_id  bigint not null references employer
);

alter table vacancy
    owner to hh;

create table favourite
(
    id          bigserial primary key,
    comment     varchar(255),
    date_create  timestamp not null,
    link_id      bigint not null,
    type        integer not null,
    views_count  bigint not null,
    employer_id bigint not null references employer,
    vacancy_id  bigint not null references vacancy
);

alter table favourite
    owner to hh;