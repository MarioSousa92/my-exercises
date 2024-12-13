function createService(name) {
    const items = []; // Armazena os itens do serviço
    return {

      // Retorna o nome do serviço
      name: function () {
        return name;
      },

      // Adiciona um item ao serviço
      add: function (item) {
        items.push(item);
        return item;
      },

      // Remove um item do serviço pelo índice
      remove: function (index) {
        if (index >= 0 && index < items.length) {
          const removedItem = items.splice(index, 1);
          return removedItem[0];
        } else {
          return null;
        }
      },

      // Remove todos os itens do serviço
      destroy: function () {
        items.length = 0;
      },

      // Atualiza um item pelo índice
      update: function (index, newItem) {
        if (index >= 0 && index < items.length) {
          items[index] = newItem;
          return newItem;
        } else {
          return null;
        }
      },

      // Retorna um item pelo índice
      get: function (index) {
        if (index >= 0 && index < items.length) {
          return items[index];
        } else {
          return null;
        }
      },

      // Lista todos os itens
      list: function () {
        return items.slice(); // Retorna uma cópia da lista
      },
    };
  }

  // Exemplo de uso:
  const myService = createService("My Basic Service");
  console.log(myService.name()); // "My Basic Service"

  myService.add({ id: 1, name: "Item 1" });
  myService.add({ id: 2, name: "Item 2" });
  myService.add({ id: 3, name: "Item 3" });
  console.log(myService.list()); // [{ id: 1, name: "Item 1" }, { id: 2, name: "Item 2" }]

  myService.update(1, { id: 2, name: "Updated Item 2" });
  console.log(myService.get(1)); // { id: 2, name: "Updated Item 2" }

  myService.remove(1);
  console.log(myService.list()); // [{ id: 2, name: "Updated Item 2" }]

  myService.destroy();
  console.log(myService.list()); // []
  