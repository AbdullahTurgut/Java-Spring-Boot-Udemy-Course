import React from 'react'
import { ListGroup } from "react-bootstrap"

export const Product = () => {
    const products = [{
        id: 1,
        name: "Product 1",
        price: 9.99,
        description: "lorem lorem lorem"
    }, {
        id: 2,
        name: "Product 2",
        price: 17.99,
        description: "lorem lorem lorem"
    }, {
        id: 3,
        name: "Product 3",
        price: 25.99,
        description: "lorem lorem lorem"
    }]

    return (
        <div className='text-success'>
            <ListGroup>
                {products.map((product, index) => (
                    <ListGroup.Item key={index}>
                        <h4>{product.name}</h4>
                        <p>Price: ${product.price}</p>
                        <p>Description: {product.description}</p>
                        <hr />
                    </ListGroup.Item>
                ))}
            </ListGroup>
        </div>
    )
}
