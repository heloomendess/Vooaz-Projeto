db.guias.insertMany([
    {
      "_id": ObjectId("635b1b17a23c4327e2a5adf1"),
      "nome": "Carlos Ferreira",
      "especialidade": "Guia de Turismo Cultural",
      "localidade": "São Paulo",
      "idiomas": ["Português", "Inglês"],
      "avaliacao": 4.8,
      "email": "carlos.ferreira@email.com",
      "contato": "+5511991234567",
      "tipo": "Autônomo",
      "especialidadeDeficiencia": "Deficiência Visual"
    },
    {
      "_id": ObjectId("635b1b17a23c4327e2a5adf2"),
      "nome": "Ana Souza",
      "especialidade": "Guia de Turismo Natural",
      "localidade": "Litoral Norte",
      "idiomas": ["Português", "Espanhol"],
      "avaliacao": 4.6,
      "email": "ana.souza@email.com",
      "contato": "+5511987654321",
      "tipo": "Vinculado a empresa",
      "especialidadeDeficiencia": "Deficiência Auditiva"
    },
    {
      "_id": ObjectId("635b1b17a23c4327e2a5adf3"),
      "nome": "Beatriz Santos",
      "especialidade": "Guia de Acessibilidade",
      "localidade": "São Paulo",
      "idiomas": ["Português"],
      "avaliacao": 4.9,
      "email": "beatriz.santos@email.com",
      "contato": "+5511998765432",
      "tipo": "Autônomo",
      "especialidadeDeficiencia": "Ambas"
    }
  ]);
  