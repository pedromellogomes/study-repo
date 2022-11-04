CREATE TABLE languages(
   "id"         BIGINT  NOT NULL PRIMARY KEY
  ,"iso639"     VARCHAR(5) NOT NULL
  ,"iso3166"    VARCHAR(2) NOT NULL
  ,"identifier" VARCHAR(7) NOT NULL
  ,"official"   BOOLEAN  NOT NULL
  ,"order"      INTEGER  NOT NULL
);
INSERT INTO languages("id","iso639","iso3166","identifier","official","order") VALUES
 (1,'ja','jp','ja-Hrkt',true,1)
,(2,'ja','jp','roomaji',true,3)
,(3,'ko','kr','ko',true,4)
,(4,'zh','cn','zh-Hant',true,5)
,(5,'fr','fr','fr',true,8)
,(6,'de','de','de',true,9)
,(7,'es','es','es',true,10)
,(8,'it','it','it',true,11)
,(9,'en','us','en',true,7)
,(10,'cs','cz','cs',false,12)
,(11,'ja','jp','ja',true,2)
,(12,'zh','cn','zh-Hans',true,6)
,(13,'pt-BR','br','pt-BR',false,13);
