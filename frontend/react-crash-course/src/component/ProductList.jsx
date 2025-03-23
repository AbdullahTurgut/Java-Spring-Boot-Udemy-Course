import React from 'react'
import { ListGroup } from "react-bootstrap"
import products from './ProductData'

export const ProductList = () => {
    return (
        <section className='mt-5'>
            <h2 className='text-info'>List of Products</h2>
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
        </section>
    )
}
