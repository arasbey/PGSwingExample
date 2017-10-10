



create sequence seq_kisi_id;

CREATE TABLE public.kisi
(
id integer NOT NULL default nextval('seq_kisi_id'),
ad character varying(30) COLLATE pg_catalog."default",
soyad character varying(40) COLLATE pg_catalog."default",
dogum_tarihi date,
cinsiyet integer,
adres character varying(200) COLLATE pg_catalog."default",
email character varying(100) COLLATE pg_catalog."default",
tel character varying(13) COLLATE pg_catalog."default",
il_id integer,
ilce_id integer,
CONSTRAINT kisi_pkey PRIMARY KEY (id),
CONSTRAINT fk_kisi_il_id FOREIGN KEY (il_id)
REFERENCES public.il (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION,
CONSTRAINT fk_kisi_ilce_id FOREIGN KEY (ilce_id)
REFERENCES public.ilce (id) MATCH SIMPLE
ON UPDATE NO ACTION
ON DELETE NO ACTION
)
WITH (
OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.kisi
OWNER to postgres;




insert into kisi (ad,soyad,email,tel,adres)
values ('Aras','CAN','arascang@gmail.com','05075289150','demetevler demet')


