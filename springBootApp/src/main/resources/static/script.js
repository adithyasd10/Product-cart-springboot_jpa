const API = "http://localhost:8080/products";

document.addEventListener("DOMContentLoaded", loadProducts);

function loadProducts(){
    fetch(API).then(r=>r.json())
        .then(data=>{const table = document.getElementById("productTable");
        table.innerHTML="";
        data.forEach(p=>{
            table.innerHTML += `
            <tr>
              <td>${p.prodId}</td>
              <td>${p.prodName}</td>
              <td>${p.price}</td>
              <td>
                <button onclick="editProduct(${p.prodId},'${p.prodName}',${p.price})">Edit</button>
                <button onclick="deleteProduct(${p.prodId})">Delete</button>
              </td>
            </tr>`;
        });
    });
}

var x = document.getElementById("heading");
console.log(x.innerText);


document.getElementById("productForm").addEventListener("submit", e=>{
    e.preventDefault();

    const product = {
        prodId: document.getElementById("prodId").value,
        prodName: document.getElementById("prodName").value,
        price: document.getElementById("price").value
    };

    fetch(API,{
        method:"POST",
        headers:{'Content-Type':'application/json'},
        body:JSON.stringify(product)
    }).then(()=>{
        resetForm();
        loadProducts();
    });
});

function editProduct(id,name,qty){
    document.getElementById("prodId").value=id;
    document.getElementById("prodName").value=name;
    document.getElementById("price").value=qty;
}

function deleteProduct(id){
    fetch(`${API}/${id}`,{method:"fetch"}).then(loadProducts);
}

function resetForm(){
    document.getElementById("prodId").value="";
    document.getElementById("prodName").value="";
    document.getElementById("price").value="";
}
