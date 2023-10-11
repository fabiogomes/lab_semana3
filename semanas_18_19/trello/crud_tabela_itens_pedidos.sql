USE COMEX;

/**
CREATE TABLE [dbo].[ITENS_PEDIDOS](
	[COD_PEDIDO] [bigint] NOT NULL,
	[COD_PRODUTO] [bigint] NOT NULL,
	[PRECO_UNITARIO] [money] NULL,
	[DESCONTO] [money] NOT NULL,
	[TIPO_DESCONTO] [varchar](50) NULL,
	[VALOR] [money] NULL,
PRIMARY KEY CLUSTERED 
(
	[COD_PEDIDO] ASC,
	[COD_PRODUTO] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[ITENS_PEDIDOS]  WITH CHECK ADD FOREIGN KEY([COD_PEDIDO])
REFERENCES [dbo].[PEDIDOS] ([COD_PEDIDO])
GO

ALTER TABLE [dbo].[ITENS_PEDIDOS]  WITH CHECK ADD FOREIGN KEY([COD_PRODUTO])
REFERENCES [dbo].[PRODUTO] ([COD_PRODUTO])
GO
**/

INSERT INTO ITENS_PEDIDOS
	VALUES
		(1000000000001, 000000000001, 1000.00, 100.00, 'A VISTA', 900.00),
		(2000000000002, 000000000002, 10000.00, 200.00, 'PIX', 9800.00),
		(3000000000003, 000000000003, 8000.00, 50.00, 'PIX', 7950.00);

SELECT * FROM ITENS_PEDIDOS;