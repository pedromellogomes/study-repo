CREATE TABLE IF NOT EXISTS stat(
   "id"              BIGINT  NOT NULL PRIMARY KEY
  ,"damage_class_id" BIGINT
  ,"identifier"      VARCHAR(15) NOT NULL
  ,"is_battle_only"  BOOLEAN  NOT NULL
  ,"game_index"      INTEGER
);
INSERT INTO stat("id","damage_class_id","identifier","is_battle_only","game_index") VALUES
 (1,NULL,'hp',false,1)
,(2,2,'attack',false,2)
,(3,2,'defense',false,3)
,(4,3,'special-attack',false,5)
,(5,3,'special-defense',false,6)
,(6,NULL,'speed',false,4)
,(7,NULL,'accuracy',true,NULL)
,(8,NULL,'evasion',true,NULL);
