/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     2017/6/20 9:55:50                            */
/*==============================================================*/


drop table if exists tb_addr;

drop table if exists tb_admuser;

drop table if exists tb_cart;

drop table if exists tb_collect;

drop table if exists tb_comment;

drop table if exists tb_comuser;

drop table if exists tb_dish;

drop table if exists tb_order;

drop table if exists tb_orderdish;

drop table if exists tb_status;

drop table if exists tb_type;

/*==============================================================*/
/* Table: tb_addr                                               */
/*==============================================================*/
create table tb_addr
(
   addrid               integer not null auto_increment,
   userid               integer not null,
   address              varchar(256) not null,
   primary key (addrid)
);

/*==============================================================*/
/* Table: tb_admuser                                            */
/*==============================================================*/
create table tb_admuser
(
   userid               integer not null,
   username             varchar(64) not null,
   password             varchar(32) not null,
   primary key (userid)
);

/*==============================================================*/
/* Table: tb_cart                                               */
/*==============================================================*/
create table tb_cart
(
   dishid               integer not null,
   userid               integer not null,
   count                integer not null,
   primary key (dishid, userid)
);

/*==============================================================*/
/* Table: tb_collect                                            */
/*==============================================================*/
create table tb_collect
(
   dishid               integer not null,
   userid               integer not null,
   primary key (dishid, userid)
);

/*==============================================================*/
/* Table: tb_comment                                            */
/*==============================================================*/
create table tb_comment
(
   commid               integer not null auto_increment,
   userid               integer not null,
   comment              varchar(420) not null,
   date                 date not null,
   dishid               integer not null,
   primary key (commid)
);

/*==============================================================*/
/* Table: tb_comuser                                            */
/*==============================================================*/
create table tb_comuser
(
   userid               integer not null auto_increment,
   username             varchar(64) not null,
   password             vachar(32) not null,
   email                varchar(255) not null,
   security             char(10),
   primary key (userid)
);

/*==============================================================*/
/* Table: tb_dish                                               */
/*==============================================================*/
create table tb_dish
(
   dishid               integer not null auto_increment,
   dishname             varchar(256) not null,
   typeid               integer not null,
   price                float not null,
   brief                text not null,
   primary key (dishid)
);

/*==============================================================*/
/* Table: tb_order                                              */
/*==============================================================*/
create table tb_order
(
   orderid              integer not null auto_increment,
   ordernum             char(20) not null,
   userid               integer not null,
   statusid             integer not null,
   date                 date not null,
   addrid               integer not null,
   primary key (orderid)
);

/*==============================================================*/
/* Table: tb_orderdish                                          */
/*==============================================================*/
create table tb_orderdish
(
   orderid              integer not null,
   dishid               integer not null,
   count                integer not null,
   primary key (orderid, dishid)
);

/*==============================================================*/
/* Table: tb_status                                             */
/*==============================================================*/
create table tb_status
(
   statusid             integer not null,
   status               varchar(256) not null,
   primary key (statusid)
);

/*==============================================================*/
/* Table: tb_type                                               */
/*==============================================================*/
create table tb_type
(
   typeid               integer not null auto_increment,
   type                 varchar(256) not null,
   primary key (typeid)
);

alter table tb_addr add constraint FK_Reference_1 foreign key (userid)
      references tb_comuser (userid) on delete restrict on update restrict;

alter table tb_cart add constraint FK_Reference_12 foreign key (dishid)
      references tb_dish (dishid) on delete restrict on update restrict;

alter table tb_cart add constraint FK_Reference_3 foreign key (userid)
      references tb_comuser (userid) on delete restrict on update restrict;

alter table tb_collect add constraint FK_Reference_4 foreign key (userid)
      references tb_comuser (userid) on delete restrict on update restrict;

alter table tb_collect add constraint FK_Reference_5 foreign key (dishid)
      references tb_dish (dishid) on delete restrict on update restrict;

alter table tb_comment add constraint FK_Reference_2 foreign key (userid)
      references tb_comuser (userid) on delete restrict on update restrict;

alter table tb_comment add constraint FK_Reference_6 foreign key (dishid)
      references tb_dish (dishid) on delete restrict on update restrict;

alter table tb_dish add constraint FK_Reference_10 foreign key (typeid)
      references tb_type (typeid) on delete restrict on update restrict;

alter table tb_order add constraint FK_Reference_11 foreign key (statusid)
      references tb_status (statusid) on delete restrict on update restrict;

alter table tb_order add constraint FK_Reference_7 foreign key (userid)
      references tb_comuser (userid) on delete restrict on update restrict;

alter table tb_order add constraint FK_Reference_9 foreign key (addrid)
      references tb_addr (addrid) on delete restrict on update restrict;

alter table tb_orderdish add constraint FK_Reference_13 foreign key (orderid)
      references tb_order (orderid) on delete restrict on update restrict;

alter table tb_orderdish add constraint FK_Reference_14 foreign key (dishid)
      references tb_dish (dishid) on delete restrict on update restrict;

