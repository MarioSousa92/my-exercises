const ENDPOINT = "http://localhost:8080/javabank5/api/customer";

async function list() {
    const response = await fetch(ENDPOINT);
    return response.json();
}

async function get(id) {
    const response = await fetch(`${ENDPOINT}/${id}`);
    return response.json();
}

async function addEdit(data) {
    const type = data.id ? "PUT" : "POST";
    const URL = data.id ? `${ENDPOINT}/${data.id}` : ENDPOINT;

    const response = await fetch(URL, {
        method: type,
        headers: {
            "Content-Type": "application/json",
        },
        body: JSON.stringify(data),
    });

    if (!response.ok) {
        throw new Error(`Error ${type === "PUT" ? "updating" : "adding"} customer`);
    }
}

async function deleteCustomer(id) {
    const response = await fetch(`${ENDPOINT}/${id}`, {
        method: "DELETE",
    });

    if (!response.ok) {
        throw new Error("Error deleting customer");
    }
}

export default { list, get, addEdit, deleteCustomer };
