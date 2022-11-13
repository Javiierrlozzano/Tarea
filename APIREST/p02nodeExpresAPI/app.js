const express = require('express');
const app = express();
const cors = require('cors');
const port = 3000;


let clientes = [
    {nombre: 'JazzTel', cif: 'A12345678', direccion:'Gran Via, 22', localidad:'Medelin'},
    {nombre: 'Orange', cif: 'A93627803', direccion:'Principe de pio, 40', localidad:'Bucaramanga'},
    {nombre: 'Movistar', cif: 'A027197369', direccion:'La castellana, 100', localidad:'bogota'},
    
]


app.use(cors());
app.use(express.json());
app.use(express.urlencoded({extended: true}));

app.get('/', (req, res) => {
    res.status(200).send(clientes);
})

app.get('/:cif', (req, res) => {
    let cliente = clientes.find(elem => {
        return elem.cif === req.params.cif;
    })
    if(cliente === undefined) {
        return res.status(404).json({
            mensaje:'No se encontro ningún cliente con ese cif'
        })
    }
    res.status(200).json({
        cliente: cliente
    })
})

app.post('/', (req, res) => {
    if(req.body === undefined) {
        return res.status(400).json({
            mensaje: 'Datos de cliente obligatorio'
        })
    }
    clientes.push(req.body);
    res.status(201).json({
        mensaje:'El cliente a Sido registrado correctamente'
    })
    // console.log(clientes);
})

app.put('/:cif', (req, res) => {
    if(req.body === undefined) {
        return res.status(400).json({
            mensaje: 'Datos de cliente a actualizar  obligatorio'
        })
    }
    if(req.params.cif === undefined) {
        return res.status(400).json({
            mensaje: 'CIF del cliente a actualizar  obligatorio'
        })
    }
    const posicion = clientes.findIndex(elem => {
        return elem.cif === req.params.cif;
    })
    if(posicion < 0) {
        return res.status(404).json({
            mensaje: 'Cliente no encontrado'
        }) 
    }
    if(req.body.nombre !== undefined) {
        clientes[posicion].nombre = req.body.nombre;
    }
    if(req.body.direccion !== undefined) {
        clientes[posicion].direccion = req.body.direccion;
    }
    if(req.body.localidad !== undefined) {
        clientes[posicion].localidad = req.body.localidad;
    }
    res.status(201).json({
        mensaje:'El cliente ha sido Actulizado correctamente'
    })
    // console.log(clientes);
})

app.delete('/:cif', (req, res) => {
    if(req.params.cif === undefined) {
        return res.status(400).json({
            mensaje: 'CIF del cliente a actualizar  obligatorio'
        })
    }
    const posicion = clientes.findIndex(elem => {
        return elem.cif === req.params.cif;
    })
    if(posicion < 0) {
        return res.status(404).json({
            mensaje: 'Cliente no encontrado'
        }) 
    }
    clientes.splice(posicion, 1);
    res.status(200).json({
        mensaje:'El cliente ha siod eliminado correctamente'
    })
    console.log(clientes);
})


app.listen(port, () => {
    console.log(`Servidor escuchando en http://localhost:${port}`);
})