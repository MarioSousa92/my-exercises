import customerService from "./customerService.js";

function addButton() {
    document.querySelector("#add-btn").addEventListener("click", async function (event) {
        event.preventDefault();

        var customer = {
            firstName: document.querySelector("#firstname").value,
            lastName: document.querySelector("#lastname").value,
            email: document.querySelector("#email").value,
            phone: document.querySelector("#phone").value,
        };

        await customerService.addEdit(customer);
        await populateCustomers();
    });
}

function updateButton() {
    document.querySelector("#update-btn").addEventListener("click", async function (event) {
        event.preventDefault();

        var customer = {
            id: document.querySelector("#update-id").value,
            firstName: document.querySelector("#firstname").value,
            lastName: document.querySelector("#lastname").value,
            email: document.querySelector("#email").value,
            phone: document.querySelector("#phone").value,
        };

        await customerService.addEdit(customer);
        await populateCustomers();
    });
}

function resetButton() {
    const reset = document.querySelector("#reset-btn");
    reset.addEventListener("click", function (event) {
        event.preventDefault();
        document.querySelector("#data-form").reset();
    });
}

function fillForm(data) {
    document.querySelector("#update-id").value = data.id;
    document.querySelector("#firstname").value = data.firstName;
    document.querySelector("#lastname").value = data.lastName;
    document.querySelector("#email").value = data.email;
    document.querySelector("#phone").value = data.phone;
}

function customerButtonHandlers() {
    const editButtonList = document.querySelectorAll(".edit-btn");
    const removeButtonList = document.querySelectorAll(".remove-btn");

    editButtonList.forEach((elem) => {
        elem.addEventListener("click", async function (event) {
            event.preventDefault();
            const customer = await customerService.get(event.currentTarget.id.split("-")[2]);

            fillForm(customer);
        });
    });

    removeButtonList.forEach((elem) => {
        elem.addEventListener("click", async function (event) {
            event.preventDefault();
            await customerService.delete(event.currentTarget.id.split("-")[2]);
            await populateCustomers();
        });
    });
}

async function populateCustomers() {
    const customerData = await customerService.list();
    let elementStr;
    const customersTable = document.querySelector("#customer-table");
    customersTable.innerHTML = "";

    customerData.forEach(function (element) {
        elementStr =
            "<tr id='customer-'" +
            element.id +
            " class='customer-data'><td>" +
            element.firstName +
            "</td>" +
            "<td>" +
            element.lastName +
            "</td>" +
            "<td>" +
            element.email +
            "</td>" +
            "<td>" +
            element.phone +
            "</td>" +
            '<td><button type="button" id="edit-btn-' +
            element.id +
            '" class="edit-btn btn btn-success">edit</button></td>' +
            '<td><button type="button" id="remove-btn-' +
            element.id +
            '" class="remove-btn btn btn-danger">delete</button></td></tr>';

        customersTable.innerHTML += elementStr;
    });

    customerButtonHandlers(); //Here we're sure the edit and remove buttons exist
}

window.addEventListener("DOMContentLoaded", function () {
    populateCustomers();
    resetButton();
    updateButton();
    addButton();
});
