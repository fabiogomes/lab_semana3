USE COMEX;

/**
CREATE TABLE [dbo].[USUARIOS_PERFIS](
	[COD_USUARIO] [bigint] NOT NULL,
	[COD_PERFIL] [bigint] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[COD_USUARIO] ASC,
	[COD_PERFIL] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[USUARIOS_PERFIS]  WITH CHECK ADD FOREIGN KEY([COD_PERFIL])
REFERENCES [dbo].[PERFIL] ([COD_PERFIL])
GO

ALTER TABLE [dbo].[USUARIOS_PERFIS]  WITH CHECK ADD FOREIGN KEY([COD_USUARIO])
REFERENCES [dbo].[USUARIOS] ([COD_USUARIO])
GO
**/

INSERT INTO USUARIOS_PERFIS
	VALUES
		(0000, 111),
		(1111, 222),
		(2222, 333);

SELECT * FROM USUARIOS_PERFIS;