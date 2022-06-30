import React from 'react';

function Navigation()
{
    return(
        <div className="Navigation">
            <Navbar bg="grenn" variant="green">
                <Nav className="navi">
                    <Nav.Link href="#recommend">RECOMMNEDATION</Nav.Link>
                    <Nav.Link href="#footprint">HIKING FOOTPRINT</Nav.Link>
                    <Nav.Link href="#recommend">HIKING DIARY</Nav.Link>
                </Nav>
            </Navbar>
        </div>
    )
}