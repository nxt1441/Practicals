import networkx as nx
g = nx.DiGraph()
g.add_node(1)
g.add_nodes_from(range(2,7))
g.add_edge(1,2)
g.add_edges_from([(2,4),(4,5),(5,6),(6,3)])
nx.draw_networkx(g)

