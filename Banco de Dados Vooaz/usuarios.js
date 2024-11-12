db.usuarios.insertMany([
    {
      "_id": ObjectId("635aecd0e5564331f0e7bb31"),
      "nome": "João Oliveira",
      "email": "joao.oliveira@email.com",
      "senha": "hash_senha_123",
      "tipoDeficiencia": "Visual",
      "dataNascimento": new Date("1996-05-15"),
      "plano": {
        "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
        "nomePlano": "Básico",
        "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
      }
    },
    {
      "_id": ObjectId("635aecd0e5564331f0e7bb32"),
      "nome": "Larissa Mendes",
      "email": "larissa.mendes@email.com",
      "senha": "hash_senha_456",
      "tipoDeficiencia": "Auditiva",
      "dataNascimento": new Date("1989-11-20"),
      "plano": {
        "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
        "nomePlano": "Premium",
        "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
      }
    },
    {
      "_id": ObjectId("635aecd0e5564331f0e7bb33"),
      "nome": "Eduardo Lima",
      "email": "eduardo.lima@email.com",
      "senha": "hash_senha_789",
      "tipoDeficiencia": "Visual e Auditiva",
      "dataNascimento": new Date("2002-02-03"),
      "plano": {
        "idPlano": ObjectId("63fae0d5f5564331f0e7ba03"),
        "nomePlano": "Grátis",
        "beneficios": ["Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade"]
      }
    },
    {
          "_id": ObjectId("635aecd0e5564331f0e7bb34"),
          "nome": "Mariana Costa",
          "email": "mariana.costa@email.com",
          "senha": "hash_senha_101",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("1990-07-22"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
          }
        },
        {
          "_id": ObjectId("635aecd0e5564331f0e7bb35"),
          "nome": "Felipe Andrade",
          "email": "felipe.andrade@email.com",
          "senha": "hash_senha_202",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("1998-09-10"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
          }
        },
        {  
          "nome": "Mariana Rodrigues de Paiva  ",
          "email": "marianapaiva@gmail.com",
          "senha": "mary@Paiva23",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("2003-08-05"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
          }
        },  
        
        { 
          "nome": "Emanuel Magno Cabral",
          "email": "emanuelmcabral@gmail.com",
          "senha": "magno@2708",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("2001-07-03"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
          }
        },

        {
          "nome": "Gabriel Carvalho de moraes",
          "email": "carvalhogabriel@gmail.com",
          "senha": "moraesgabs@2805",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("1998-05-26"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
        }
        },

        {
          "nome": "Aline Ribeiro Rodrigues",
          "email": "lineribeiro02@gmail.com",
          "senha": "alirodri3012",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("2004-02-31"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios":  ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
        }
        },
        {
          "nome": "João da Silva Carvalho",
          "email": "joãosilva304@gail.com",
          "senha": "silva@4098",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("1997-10-27"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba03"),
            "nomePlano": "Grátis",
            "beneficios":  ["Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade"]
        }
        },
        {
          "nome": "Pietro Monteiro Albuquerque",
          "email": "pietromc2023@gmail.com",
          "senha": "mcpietro4049",
          "tipoDeficiencia": "Auditiva e Visual",
          "dataNascimento": new Date("1998-03-24"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios":["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
        }
        },
        {
          "nome": "Alexandra Felix Araujo",
          "email": "alearaujo2007@gmail.com",
          "senha": "230598_araujo",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("2005-10-05"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
        }
        },
        {
          "nome": "Nicolas Bittencort Alencar",
          "email": "nicolasbitt@gmail.com",
          "senha": "bittencort_2705",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("2003-03-27"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
        }
        },
        {
          "nome": "Gisele Massafera de Sousa",
          "email": "giselemassafera@gmail.com",
          "senha": "massafera@3012",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("1996-04-08"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba03"),
            "nomePlano": "Grátis",
            "beneficios":  ["Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade"]
        }
        },
        {
          "nome": "Bruno Lima Ribeiro",
          "email": "limabruno@gmail.com",
          "senha": "2809lima",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("2002-05-24"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
          }
        },
        {
          "nome": "Maria Cláudia Matos da Silva",
          "email": "mariclaudia@gmail.com",
          "senha": "Clau_038796",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("1999-12-20"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba03"),
            "nomePlano": "Grátis",
            "beneficios":  ["Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade"]
        }
        },
        {
          "nome": " Hosana Martins Machado",
          "email": "nanamartins@gmail.com",
          "senha": "nana@1996",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("1997-06-31"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba03"),
            "nomePlano": "Grátis",
            "beneficios": ["Roteiros de viagens", "Visitas em grupo", "Experiências culturais", "Guias de acessibilidade"]
        }
        },
        {
          "nome": "Felipe de sousa Carvalho",
          "email": "felipesousa3098@gmail.com",
          "senha": "felpisc3014",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("1999-11-25"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba01"),
            "nomePlano": "Básico",
            "beneficios": ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais"]
        }
        },
        {
          "nome": "Lucas Ferraz de Oliveira",
          "email": "lucasferraz97@gmail.com",
          "senha": "16051997",
          "tipoDeficiencia": "Visual",
          "dataNascimento": new Date("2004-07-26"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios":  ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
        }
        },
        {
          "nome": "Fernanda Lopes de Sousa",
          "email": "fernandalopes3007@gmail.com",
          "senha": "lopes@3007",
          "tipoDeficiencia": "Auditiva",
          "dataNascimento": new Date("2002-03-24"),
          "plano": {
            "idPlano": ObjectId("63fae0d5f5564331f0e7ba02"),
            "nomePlano": "Premium",
            "beneficios":  ["Guias de acessibilidade", "Roteiros de viagens", "Visitas em grupo", "Match com outros viajantes", "Transporte para locais culturais", "Intercâmbios culturais pelo mundo", "Dicas internacionais"]
        }
        },

  ]);
  