import pandas as pd
import matplotlib.pyplot as plt

# Read the CSV
df = pd.read_csv("resultss.csv", names=["Algorithm","InputSize","Time"], header=None, encoding="utf-8")

# Define colors for each algorithm
colors = {
    "Bubble": "blue",
    "Quick": "red",
    "Heap": "green",
    "Selection": "orange",
    "Merge": "purple"
}

# Plot line graph for each algorithm
for algo in df["Algorithm"].unique():
    subset = df[df["Algorithm"] == algo]
    plt.plot(subset["InputSize"], subset["Time"], marker="o", label=algo, color=colors.get(algo, "black"))

# Labels, title, grid
plt.xlabel("Input Size (n)")
plt.ylabel("Time (ns)")
plt.title("Sorting Algorithm Performance")
plt.legend()
plt.grid(True)

# Save the graph as PNG for GitHub
plt.savefig("sorting_graph.png")

# Show the graph
plt.show()
