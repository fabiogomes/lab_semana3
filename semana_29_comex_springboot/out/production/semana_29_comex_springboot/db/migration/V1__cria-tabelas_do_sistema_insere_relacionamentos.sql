    create table categoria (
        ativo bit not null,
        id bigint not null auto_increment,
        nome varchar(50) not null,
        primary key (id)
    );

    create table cliente (
        estado varchar(2) not null,
        id bigint not null auto_increment,
        numero varchar(10) not null,
        cpf varchar(14) not null,
        telefone varchar(18) not null,
        bairro varchar(50) not null,
        cidade varchar(50) not null,
        complemento varchar(50),
        nome varchar(50) not null,
        rua varchar(50) not null,
        primary key (id)
    );

    create table item_pedido (
        desconto decimal(38,2),
        preco_unitario decimal(38,2) not null,
        quantidade integer not null,
        id bigint not null auto_increment,
        pedido_id bigint,
        produto_id bigint,
        tipo_desconto varchar(10),
        primary key (id)
    );

    create table pedido (
        datacadastro date not null,
        desconto decimal(38,2),
        tipo_desconto varchar(50),
        valortotal decimal(38,2),
        cliente_id bigint,
        id bigint not null auto_increment,
        primary key (id)
    );

    create table produto (
        preco decimal(38,2),
        qtd_estoque integer,
        categoria_id bigint,
        id bigint not null auto_increment,
        nome varchar(50) not null,
        descricao varchar(100) not null,
        primary key (id)
    );

    alter table item_pedido 
       add constraint FK60ym08cfoysa17wrn1swyiuda 
       foreign key (pedido_id) 
       references pedido (id);

    alter table item_pedido 
       add constraint FKtk55mn6d6bvl5h0no5uagi3sf 
       foreign key (produto_id) 
       references produto (id);

    alter table pedido 
       add constraint FK30s8j2ktpay6of18lbyqn3632 
       foreign key (cliente_id) 
       references cliente (id);

    alter table produto 
       add constraint FKopu9jggwnamfv0c8k2ri3kx0a 
       foreign key (categoria_id) 
       references categoria (id);