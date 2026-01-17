
def maxTurbulenceSize(arr):

    if not arr:
        return 0
    elif len(arr) == 1:
        return 1
    else:

        up_slope = False
        down_slope = False
        max_sub = 1

        curr_sub = 2
        for i in range(len(arr) - 1):

            curr_slope = arr[i] - arr[i + 1]

            if curr_slope > 0 and up_slope:
                curr_sub += 1
            elif curr_slope < 0 and down_slope:
                curr_sub += 1
            elif curr_slope == 0:
                curr_sub = 1
            else:
                curr_sub = 2

            if arr[i] > arr[i + 1]:
                down_slope = True
                up_slope = False
            elif arr[i] < arr[i + 1]:
                up_slope = True
                down_slope = False
            else:
                up_slope = False
                down_slope = False
            
            max_sub = max(max_sub, curr_sub)
            
        return max_sub

if __name__=="__main__":

    lst = [9,4,2,10,7,8,8,1,9]
    print(maxTurbulenceSize(lst))

