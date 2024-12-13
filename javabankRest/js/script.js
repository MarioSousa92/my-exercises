document.addEventListener('DOMContentLoaded', function () {
    let listapifield = "";
    url = "http://localhost:8080/javabank5/api/customer"

    async function getData(url) {

        const response = await fetch(url);
        const data = await response.json();

        renderhtml(data)
        //fetch(url)
          //  .then((response) => response.json())
            //.then((data) => renderhtml(data))
            //.catch((error) => console.error(error));
    }

    getData(url);

    function renderhtml(data) {

        const htmldinamic = document.querySelector("#list");
        console.log(data);

        for (let i = 0; i < data.length; i++) {

            listapifield += '<div class="rowlist"><div class="fnamelist">' 
            + data[i].firstName + '</div><div class="lnamelist">' + data[i].lastName + 
            '</div><div class="emailist">' + data[i].email + '</div><div class="phonelist">' 
            + data[i].phone + '</div><div class="editlist"><button class="editlists">Edit</button></div>'+
            '<div class="deletelist"><button class="deletelists">Delete</button></div></div>';
        }

        htmldinamic.innerHTML = listapifield;
    }

    const btadd = this.documentElement.querySelector(".btadd");
    btadd.addEventListener("click", newrefresh, false);
    const btupdate = this.documentElement.querySelector(".btupdate");
    btupdate.addEventListener("click", newrefresh, false);
    const btreset = this.documentElement.querySelector(".btreset");
    btreset.addEventListener("click", newrefresh, false);
    const editlists = this.documentElement.querySelector(".editlists");
    editlists.addEventListener("click", newrefresh, false);
    const deletelist = this.documentElement.querySelector(".deletelist");
    deletelist.addEventListener("click", newrefresh, false);

});