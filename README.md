# mergeSortedArrays
Two sorted arrays A and B,  A has enough buffers, merge B into A in a sorted order

You are given two sorted arrays, A and B, where A has a large enough buffer at the end to hold B. Write a method to merge B into A in sorted order

We don't need additional spaces since A has enough buffer

just copy element into a.length+b.length-1 from the last element

copy the remainder from array B
