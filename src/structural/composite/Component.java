package structural.composite;

//抽象组件
public interface Component {
}

//叶子组件
interface Leaf extends Component {
}

//容器组件
interface Composite extends Component{
    void add(Component component);
    void remove(Component component);
    Component getChild(int index);
}
