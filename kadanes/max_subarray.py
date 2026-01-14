
# brute force

def brute_max_subarray(lst):
    max_sum = lst[0] # or zero if result can be empty

    for i in range(len(lst)):
        temp_sum = 0
        for j in range(i, len(lst)):
            temp_sum += lst[j]
            max_sum = max(max_sum, temp_sum)
    return max_sum


def kadanes_max_subarray(lst):
    # if subarray sum is negative move left pointer to new positive
    # max sum = 2    
    right = 0
    max_sum = lst[0]
    temp_sum = 0
    while right < len(lst):
        temp_sum += lst[right]
        max_sum = max(max_sum, temp_sum)
        if temp_sum < 0:
            temp_sum = 0
        right += 1
    return max_sum


def kadanes_max_subarray_simple(lst):
    maxSum = lst[0]
    curSum = 0

    for n in lst:
        curSum = max(curSum, 0)
        curSum += n
        maxSum = max(maxSum, curSum)
    return maxSum

lst = [2,-3,4,-2,2,1,-1,4]
print(brute_max_subarray(lst))
print(kadanes_max_subarray(lst))
print(kadanes_max_subarray_simple(lst))