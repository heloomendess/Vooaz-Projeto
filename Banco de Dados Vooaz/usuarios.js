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
        }    
  ]);
  