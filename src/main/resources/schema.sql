create table article
(
   id integer not null AUTO_INCREMENT,
   title varchar(255) not null,
   intro varchar(255) not null,
   text varchar(255) not null,
   picture varchar(255) not null,
   picture_description varchar(255) not null,
   primary key(id)
);

create table tag
(
   id integer not null AUTO_INCREMENT,
   description varchar(255) not null,
   primary key(id)
);

create table article_tag
(
   article_id integer not null,
   tag_id integer not null,
   primary key(article_id, tag_id)
);

