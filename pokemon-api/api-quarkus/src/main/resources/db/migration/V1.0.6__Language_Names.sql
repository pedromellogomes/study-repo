CREATE TABLE language_names(
   "fk_language_id"    BIGINT  NOT NULL REFERENCES languages("id")
  ,"local_language_id" BIGINT  NOT NULL
  ,"name"              VARCHAR(16) NOT NULL
);
INSERT INTO language_names("fk_language_id","local_language_id","name") VALUES
 (1,1,'日本語')
,(1,3,'일본어')
,(1,5,'Japonais')
,(1,6,'Japanisch')
,(1,7,'Japonés')
,(1,9,'Japanese')
,(2,1,'正式ローマジ')
,(2,3,'정식 로마자')
,(2,5,'Romaji')
,(2,6,'Rōmaji')
,(2,9,'Official roomaji')
,(3,1,'韓国語')
,(3,3,'한국어')
,(3,5,'Coréen')
,(3,6,'Koreanisch')
,(3,7,'Coreano')
,(3,9,'Korean')
,(4,1,'中国語')
,(4,3,'중국어')
,(4,5,'Chinois')
,(4,6,'Chinesisch')
,(4,7,'Chino')
,(4,9,'Chinese')
,(5,1,'フランス語')
,(5,3,'프랑스어')
,(5,5,'Français')
,(5,6,'Französisch')
,(5,7,'Francés')
,(5,9,'French')
,(6,1,'ドイツ語')
,(6,3,'도이치어')
,(6,5,'Allemand')
,(6,6,'Deutsch')
,(6,7,'Alemán')
,(6,9,'German')
,(7,1,'西語')
,(7,3,'스페인어')
,(7,5,'Espagnol')
,(7,6,'Spanisch')
,(7,7,'Español')
,(7,9,'Spanish')
,(8,1,'伊語')
,(8,3,'이탈리아어')
,(8,5,'Italien')
,(8,6,'Italienisch')
,(8,7,'Italiano')
,(8,9,'Italian')
,(9,1,'英語')
,(9,3,'영어')
,(9,5,'Anglais')
,(9,6,'Englisch')
,(9,7,'Inglés')
,(9,9,'English')
,(10,1,'チェコ語')
,(10,3,'체코어')
,(10,5,'Tchèque')
,(10,6,'Tschechisch')
,(10,7,'Checo')
,(10,9,'Czech');
