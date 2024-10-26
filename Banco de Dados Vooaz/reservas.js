db.reservas.insertMany([
    {
      "usuario_id": "635aecd0e5564331f0e7bb33", 
      "guia_id": "635b1b17a23c4327e2a5adf2",
      "destino_id": "635b2f77c71f1c45e5d7ba19",
      "data_reserva": ISODate("2024-11-15T10:00:00Z"),
      "status": "Confirmada",
      "pagamento": "Completo"
    },
    {
      "usuario_id": "635aecd0e5564331f0e7bb34",
      "guia_id": "635b1b17a23c4327e2a5adf3",
      "destino_id": "635b2f77c71f1c45e5d7ba20",
      "data_reserva": ISODate("2024-12-20T15:00:00Z"),
      "status": "Pendente",
      "pagamento": "Em Aberto"
    },
    {
      "usuario_id": "635aecd0e5564331f0e7bb35",
      "guia_id": "635b1b17a23c4327e2a5adf4",
      "destino_id": "635b2f77c71f1c45e5d7ba21",
      "data_reserva": ISODate("2024-10-25T08:30:00Z"),
      "status": "Cancelada",
      "pagamento": "Reembolsado"
    }
  ]);
  