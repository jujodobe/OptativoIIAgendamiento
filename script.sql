-- public.personas definition

-- Drop table

-- DROP TABLE public.personas;

CREATE TABLE public.personas (
	id serial4 NOT NULL,
	nombre varchar(30) NOT NULL,
	apellido varchar(30) NOT NULL,
	"TipoDocumento" varchar(20) NOT NULL,
	email varchar(30) NULL,
	fechanacimiento date NULL,
	estado varchar(15) NULL,
	direccion varchar(50) NULL,
	celular varchar(15) NULL,
	nrodocumento varchar(20) NULL,
	CONSTRAINT personas_pkey PRIMARY KEY (id)
);