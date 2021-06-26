import React from 'react';
import { ProSidebar, Menu, MenuItem, SubMenu } from 'react-pro-sidebar';
import 'react-pro-sidebar/dist/css/styles.css';
import './style.css'

const Sidebar = () => {

    return (
        <div>
            <ProSidebar>
                <Menu iconShape="square">
                    <div>
                    <MenuItem >Dashboard</MenuItem>
                    </div>
                    <div>
                    <SubMenu title="Components">
                        <MenuItem>Component 1</MenuItem>
                        <MenuItem>Component 2</MenuItem>
                    </SubMenu>
                    </div>
                    <div>
                    <SubMenu title="Components">
                        <MenuItem>Component 1</MenuItem>
                        <MenuItem>Component 2</MenuItem>
                    </SubMenu>
                    </div>
                </Menu>
            </ProSidebar>
        </div>
    )
};

export default Sidebar;